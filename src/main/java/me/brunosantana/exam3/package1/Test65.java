package me.brunosantana.exam3.package1;

public class Test65 {
    public static void main(String[] args) {
        String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }
}
