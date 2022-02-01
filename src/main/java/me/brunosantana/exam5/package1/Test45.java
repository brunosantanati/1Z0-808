package me.brunosantana.exam5.package1;

import java.util.ArrayList;
import java.util.List;
 
public class Test45 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //byte b = 10;
        //list.add(b); //Line n1 //The method add(Integer) in the type List<Integer> is not applicable for the arguments (byte)
        int b = 10;
        list.add(b);
        int mul = list.get(0) * list.get(0); //Line n2
        System.out.println(mul);
    }
}
