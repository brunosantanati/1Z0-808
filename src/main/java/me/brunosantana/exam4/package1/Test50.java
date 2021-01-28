package me.brunosantana.exam4.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test50 {
     public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("Hello");
         List<StringBuilder> list = new ArrayList<>();
         list.add(sb);
         list.add(new StringBuilder("Hello"));
         list.add(sb);
         sb.append("World!");
 
         System.out.println(list);
     }
}
