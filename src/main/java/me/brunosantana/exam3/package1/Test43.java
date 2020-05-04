package me.brunosantana.exam3.package1;

import java.util.ArrayList;
import java.util.List;
 
interface Sellable {}
abstract class Animal {}
class Mammal extends Animal{}
class Rabbit extends Mammal implements Sellable{}
 
public class Test43 {
     {
         List<Animal> list = new ArrayList<>();
         list.add(new Rabbit());
     }
     {
         List<Animal> list = new ArrayList<>();
         list.add(new Mammal());
     }
     {
         List<Mammal> list = new ArrayList<>();
         list.add(new Rabbit());
     }
     {
         List<Sellable> list = new ArrayList<>();
         //list.add(new Mammal()); //compilation error
         //Mammal doesn't implement Sellable hence new Mammal() can't be added to list.
     }
     {
         List<Sellable> list = new ArrayList<>();
         list.add(new Rabbit());
     }
}
