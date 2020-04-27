package me.brunosantana.exam3.package1;

import java.util.function.Predicate;

public class Test21 {
     public static void main(String[] args) {
         printNumbers(i -> i % 2 != 0);
         //precedence order: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
     }
 
     private static void printNumbers(Predicate<Integer> predicate) {
         for(int i = 1; i <= 10; i++) {
             if(predicate.test(i)) {
                 System.out.print(i);
             }
         }
     }
}

/*
In the boolean expression (predicate.test(i)): i is of primitive int type but auto-boxing 
feature converts it to Integer wrapper type. 

test(Integer) method of Predicate returns true if passed number is an odd number, 
so given loop prints only odd numbers. for loops works for the numbers from 1 to 10.
*/
