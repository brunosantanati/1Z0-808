package me.brunosantana.exam3.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test23 {
     public static void main(String[] args) {
         List<String> trafficLight = new ArrayList<>();
         /*trafficLight.add(1, "RED"); //java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
         trafficLight.add(2, "ORANGE");
         trafficLight.add(3, "GREEN");*/
         
         //FIX
         trafficLight.add(0, "RED");
         trafficLight.add(1, "ORANGE");
         trafficLight.add(2, "GREEN");
         //END FIX
 
         //trafficLight.remove(new Integer(2));
         boolean removed = trafficLight.remove(new Integer(2)); //matches with trafficLight.remove(Object)
         System.out.println(removed);
 
         System.out.println(trafficLight);
     }
}

/*
There is no element at index 0 so call to add element at index 1, 
"trafficLight.add(1, "RED");" throws an instance of java.lang.IndexOutOfBoundsException. 


trafficLight.remove(new Integer(2)); matches with trafficLight.remove(Object) and 
hence no compilation error.
*/
