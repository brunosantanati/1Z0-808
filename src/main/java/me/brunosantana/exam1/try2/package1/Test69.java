package me.brunosantana.exam1.try2.package1;

import java.util.ArrayList;
import java.util.List;

public class Test69 {
    public static void main(String[] args) {
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");

        System.out.println(list);
    }
}

/*
 * String is immutable, which means s.replace("l", "L"); 
 * creates another String instance "HeLLo" but s still refers to "Hello" [s --> "Hello"]. 
 * */
