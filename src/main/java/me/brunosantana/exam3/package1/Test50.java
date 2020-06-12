package me.brunosantana.exam3.package1;

//public class Test50 extends String { //String is a final class so it cannot be extended.
public class Test50 { //FIX
    @Override
    public String toString() {
        return "TEST";
    }

    public static void main(String[] args) {
        Test50 obj = new Test50();
        System.out.println(obj);
    }
}
