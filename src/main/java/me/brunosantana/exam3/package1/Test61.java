package me.brunosantana.exam3.package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
In this example, code is trying to remove an item from the list while iterating using traditional for loop 
so one can think that this code would throw java.util.ConcurrentModificationException.

But note, java.util.ConcurrentModificationException will never be thrown for traditional for loop. 
It is thrown for for-each loop or while using Iterator/ListIterator.

In this case dryFruits.remove(new StringBuilder("Almond")); will never remove any items from the list 
as StringBuilder class doesn't override the equals(Object) method of Object class.
 */
public class Test61 {
	public static void main(String[] args) {
		List<StringBuilder> dryFruits = new ArrayList<>();
		dryFruits.add(new StringBuilder("Walnut"));
		dryFruits.add(new StringBuilder("Apricot"));
		dryFruits.add(new StringBuilder("Almond"));
		dryFruits.add(new StringBuilder("Date"));

		for (int i = 0; i < dryFruits.size(); i++) {
			if (i == 0) {
				dryFruits.remove(new StringBuilder("Almond"));
			}
		}

		System.out.println(dryFruits);

		// my own tests -----------------------
		
		usingTraditionalLoop();
		usingForEachLoop();
		usingIterator();
		usingIterator2();
	}

	private static void usingTraditionalLoop() {
		List<String> dryFruits = new ArrayList<>();
		dryFruits.add("Walnut");
		dryFruits.add("Apricot");
		dryFruits.add("Almond");
		dryFruits.add("Date");	

		for (int i = 0; i < dryFruits.size(); i++) {
			if (i == 0) {
				dryFruits.remove("Almond"); //OK (java.util.ConcurrentModificationException will never be thrown for traditional for loop)
			}
		}

		System.out.println(dryFruits);		
	}

	private static void usingForEachLoop() {
		List<String> dryFruits = new ArrayList<>();
		dryFruits.add("Walnut");
		dryFruits.add("Apricot");
		dryFruits.add("Almond");
		dryFruits.add("Date");

		for (String item : dryFruits) {
			dryFruits.remove(item); //Exception in thread "main" java.util.ConcurrentModificationException
		}

		System.out.println(dryFruits);
	}
	
	private static void usingIterator() {
		List<String> dryFruits = new ArrayList<>();
		dryFruits.add("Walnut");
		dryFruits.add("Apricot");
		dryFruits.add("Almond");
		dryFruits.add("Date");

		Iterator<String> iterator = dryFruits.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			if (item.equals("Almond")) {
				dryFruits.remove("Almond"); //OK (probably It's OK because remove the item in its turn)
				//iterator.remove(); //OK
			}
		}

		System.out.println(dryFruits);
	}
	
	private static void usingIterator2() {
		List<String> dryFruits = new ArrayList<>();
		dryFruits.add("Walnut");
		dryFruits.add("Apricot");
		dryFruits.add("Almond");
		dryFruits.add("Date");

		Iterator<String> iterator = dryFruits.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			if (item.equals("Walnut")) {
				dryFruits.remove("Almond"); //Exception in thread "main" java.util.ConcurrentModificationException
			}
		}

		System.out.println(dryFruits);
	}
}
