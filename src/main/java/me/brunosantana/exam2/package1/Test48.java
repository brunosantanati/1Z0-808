package me.brunosantana.exam2.package1;

//execute using programm arguments: AM PM
//ex: java Test48 AM PM
public class Test48 {
    private static boolean flag = !true;

    public static void main(String [] args) {
        System.out.println(!flag ? args[0] : args[1]);
    }
}
