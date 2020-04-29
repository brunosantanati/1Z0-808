package me.brunosantana.exam3.package1;

public class Test39Greetings {
    String msg = null;

    public Test39Greetings() {
        this("Good Morning!");
    }

    public Test39Greetings(String str) {
        msg = str;
    }

    public void displayMsg() {
        System.out.println(msg);
    }

    public static void main(String [] args) {
    	Test39Greetings g1 = new Test39Greetings();
    	Test39Greetings g2 = new Test39Greetings("Good Evening!");
        g1.displayMsg();
        g2.displayMsg();
    }
}
