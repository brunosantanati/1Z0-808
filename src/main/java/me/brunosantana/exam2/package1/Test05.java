package me.brunosantana.exam2.package1;

public class Test05 {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2); //false
        System.out.println(name2 == name3); //true
    }
}
