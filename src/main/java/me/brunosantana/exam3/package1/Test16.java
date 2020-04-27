package me.brunosantana.exam3.package1;

public class Test16 {
    public static void change(int num) {
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int i1 = 1;
        Test16.change(i1);
        System.out.println(i1);
    }
}

/*
It is pass-by-value scheme. 
On method invocation, parameter variable num gets a copy and 
changes are made to this copy inside the method. Original value of i1 stay intact.
*/