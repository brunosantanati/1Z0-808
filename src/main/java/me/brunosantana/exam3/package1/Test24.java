package me.brunosantana.exam3.package1;

public class Test24 {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            default:
                System.out.println("Still no idea what x is"); //Even though default block is available at the top but matching case is present. 
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3: 
                System.out.println("x is equal to 3");
                break;
        }
    }
}
