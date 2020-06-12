package me.brunosantana.exam3.package1;

import java.util.Random;

import me.brunosantana.exam3.package2.Counter;
 
/*
 * Currently on executing Test class, a random value between 1 and 50 is printed on to the console.
 * For the class Test, which options, if used to replace INSERT, will always print 10 on to the console? 
 * Select 3 options.
 */
public class Test53 {
     public static void main(String[] args) {
         Random random = new Random();
         int num = random.nextInt(51);
         Counter counter = new Counter(num);
 
         /*INSERT*/
         //counter.change(-counter.getCount() + 10); //It prints 10
         //counter.change(10 - counter.count); //It prints 10
         counter.count = 10; //It prints 10
 
         System.out.println(counter.getCount());
     }
}
