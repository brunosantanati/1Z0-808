package me.brunosantana.exam4.package1;

import java.util.ArrayList;
import java.util.List;
 
abstract class Animal {}
class Dog extends Animal{}
 
public class Test12 {
     public static void main(String [] args) {
         //List<Animal> list = new ArrayList<Dog>(); //Unresolved compilation problem: Type mismatch: cannot convert from ArrayList<Dog> to List<Animal>
    	 List<Animal> list = new ArrayList<Animal>(); //FIX
         list.add(0, new Dog());
         System.out.println(list.size() > 0);
     }
}
