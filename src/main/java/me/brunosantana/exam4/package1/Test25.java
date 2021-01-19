package me.brunosantana.exam4.package1;

public class Test25 {
    public static void main(String[] args) {
        extractInt(2.7);
        //extractInt(2); //Unresolved compilation problem: The method extractInt(Double) in the type Test25 is not applicable for the arguments (int)
        extractInt(2.999999);
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
}
