package me.brunosantana.exam1.try2.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test47 {
     public static void main(String[] args) {
         List<Character> list = new ArrayList<>();
         list.add(0, 'V');
         list.add('T');
         list.add(1, 'E');
         list.add(3, 'O');
 
         if(list.contains('O')) {
             //list.remove('O'); //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 79 out of bounds for length 4
        	 list.remove(Character.valueOf('O')); //list.remove(new Character('O')) //deprecated;
         }
 
         for(char ch : list) {
             System.out.print(ch);
         }
     }
}

/* list.contains('O') => char 'O' is auto-boxed to Character object and as 
 * Character class overrides equals(String) method this expression returns true. 
 * Control goes inside if-block and executes: list.remove('O');.
 * 
 * remove method is overloaded: remove(int) and remove(Object). 
 * char can be easily assigned to int so compiler tags remove(int) method. 
 * list.remove(<ASCCI value of 'O'>); ASCCI value of 'A' is 65 (this everybody knows) 
 * so ASCII value of 'O' will be more than 65.
 * 
 * list.remove('O') throws runtime exception, as it tries to remove an item from the index greater than 65
 * but allowed index is 0 to 3 only.
*/
