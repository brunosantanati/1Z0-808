package me.brunosantana.exam3.package1;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.set(0, "List"); //list.set(0, "List"); means replace the current element at index 0 with the passed element "List"

        System.out.println(list);
    }
}
