package me.brunosantana.exam1.package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test30 {
	public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");
        
        Iterator<String> it = dryFruits.iterator();
        while(it.hasNext()) {
            String dryFruit = it.next();
            if(dryFruit.startsWith("W")) {
            	it.remove();
            }
        }
       
        System.out.println(dryFruits);

        Iterator<String> iterator = dryFruits.iterator();
        while(iterator.hasNext()) {
            String dryFruit = iterator.next(); //Exception in thread "main" java.util.ConcurrentModificationException
            if(dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);
            }
        }
       
        System.out.println(dryFruits);
        
        /*
         * If you want to remove the items from ArrayList, while using Iterator or ListIterator, then use Iterator.remove() or ListIterator.remove() method and NOT List.remove(...) method. Using List.remove(...) method while iterating the list (using the Iterator/ListIterator or for-each) may throw java.util.ConcurrentModificationException.
         * 
         */
   }
}
