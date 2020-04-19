package me.brunosantana.exam2.package1;

class Message2 {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Test66 {
    public static void change(Message2 m) {
        m.msg = "Happy Holidays!";
    }

    public static void main(String[] args) {
        Message2 obj = new Message2();
        obj.print();
        change(obj); //It is pass-by-reference scheme.
        obj.print();
    }
}
