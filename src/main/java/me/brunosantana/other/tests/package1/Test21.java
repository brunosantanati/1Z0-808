package me.brunosantana.other.tests.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");
 
        List<String> subList = list.subList(1, 2); //Line n1
        System.out.println(list);
        System.out.println(subList);
        //subList.set(0, "E"); //Line n2
        list.set(1, "E");
        System.out.println(list);
        System.out.println(subList);
    }
}
