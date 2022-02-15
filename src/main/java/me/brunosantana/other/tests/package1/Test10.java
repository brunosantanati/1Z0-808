package me.brunosantana.other.tests.package1;

public class Test10 {
    public static void main(String[] args) {
        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        //System.out.println(flag1 && flag2);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println("Java" == "Java");
    }
}
