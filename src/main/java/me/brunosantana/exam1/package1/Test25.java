package me.brunosantana.exam1.package1;

class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Test25 {
    public static void change(Message m) {
        m = new Message();
        m.msg = "Happy Holidays!";
    }
    
    public static void change2(Message m) { //pass-by-reference
        m.msg = "Happy Holidays!";
    }

    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();
        change(obj);
        obj.print();
        change2(obj);
        obj.print();
    }
}