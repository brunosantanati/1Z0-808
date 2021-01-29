package me.brunosantana.exam4.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test68 {
     public static void main(String[] args) {
         Boolean [] arr = new Boolean[2];
         List<Boolean> list = new ArrayList<>();
         list.add(arr[0]);
         list.add(arr[1]);
         System.out.println(list);
 
         if(list.remove(0)) { //java.lang.NullPointerException
             list.remove(1);
         }
 
         System.out.println(list);
     }
}
