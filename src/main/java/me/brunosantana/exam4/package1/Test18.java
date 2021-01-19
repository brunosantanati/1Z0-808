package me.brunosantana.exam4.package1;

public class Test18 {
	 
    private static void add(int i, int j) {
        System.out.println("int version");
    }

    private static void add(Integer i, Integer j) {
        System.out.println("Integer version");
    }

    public static void main(String[] args) {
        add(10, 20);
        add(null, null);
        add(new Integer(10), new Integer(20));
    }

}
