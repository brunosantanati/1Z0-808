package me.brunosantana.exam1.try2.package1;

public class Test22 {
    public static void main(String[] args) {
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
            //case 200: //Unresolved compilation problem: Type mismatch: cannot convert from int to byte
            case 127:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("In default");
        }
    }
}
