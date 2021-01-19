package me.brunosantana.exam4.package1;

public class Test11 {
    public static void main(String [] args) {
        int a = 3;
        m(++a, a++);
        System.out.println(a);
    }

    private static void m(int i, int j) {
    	//System.out.println(i + " " + j);
        i++;
        j--;
        //System.out.println(i + " " + j);
    }
}