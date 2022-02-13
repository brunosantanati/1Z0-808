package me.brunosantana.exam5.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test68 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");
 
        List<String> subList = list.subList(1, 2); //Line n1
        subList.set(0, "E"); //Line n2
        System.out.println(list);
    }
}
