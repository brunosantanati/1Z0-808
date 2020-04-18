package me.brunosantana.exam2.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test35 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
        System.out.println(list.remove(0) + ":" + list.remove(null));
        System.out.println(list);
    }
}
