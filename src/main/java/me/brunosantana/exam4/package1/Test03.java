package me.brunosantana.exam4.package1;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        list.add(0, "Array");
        list.add(2, "List"); //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 2, Size: 1

        System.out.println(list);
    }
}
