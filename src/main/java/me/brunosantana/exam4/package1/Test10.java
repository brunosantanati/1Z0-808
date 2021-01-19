package me.brunosantana.exam4.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test10 {
     public static void main(String[] args) {
         List<Character> list = new ArrayList<>();
         list.add(0, 'V');
         //System.out.println(list);
         list.add('T');
         //System.out.println(list);
         list.add(1, 'E');
         //System.out.println(list);
         list.add(3, 'O');
         //System.out.println(list);
 
         if(list.contains('O')) {
             list.remove(3);
         }
 
         for(char ch : list) {
             System.out.print(ch);
         }
     }
}
