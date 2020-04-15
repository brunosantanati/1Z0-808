package me.brunosantana.exam2.package1;

import java.util.function.Predicate;

public class Test01 {
     public static void main(String[] args) {
         String [] arr = {"*", "**", "***", "****", "*****"};
         //Predicate pr1 = s -> s.length() < 4; //Unresolved compilation problem: The method length() is undefined for the type Object
         //Predicate pr1 = s -> ((String)s).length() < 4; //OK
         Predicate<String> pr1 = s -> s.length() < 4; //OK
         print(arr, pr1);
     }
 
     private static void print(String [] arr, Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
     }
}
