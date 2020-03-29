package me.brunosantana.exam1.try2.package1;

public class Test07 {
	public static void main(String[] args) {
        String fruit = "mango";
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
        
        System.out.println("---------");
        
        String fruit2 = "mango";
        switch (fruit2) {
            default:
                System.out.println("ANY FRUIT WILL DO");
                break;
            case "Apple":
                System.out.println("APPLE");
                break;
            case "mango":
                System.out.println("MANGO");
                break;
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }
}
