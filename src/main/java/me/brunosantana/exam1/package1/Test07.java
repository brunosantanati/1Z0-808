package me.brunosantana.exam1.package1;

class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
    
    /*@Override
    public String toString() {
    	return this.str; 
    }*/
}

public class Test07 {
    public static void main(String[] args) {
        System.out.println(new String("Java"));
        System.out.println(new StringBuilder("Java"));
        System.out.println(new SpecialString("Java"));
    }
}
