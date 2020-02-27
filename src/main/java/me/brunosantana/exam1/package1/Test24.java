package me.brunosantana.exam1.package1;

public class Test24 {
	public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));
        System.out.println(str.equals(sb.toString()) + ":" + sb.toString().equals(str));
    }
}
