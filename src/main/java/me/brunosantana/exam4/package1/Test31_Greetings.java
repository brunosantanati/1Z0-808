package me.brunosantana.exam4.package1;

public class Test31_Greetings {
    String msg = null;
    public Test31_Greetings() {
    }
    
    public Test31_Greetings(String str) {
        msg = str;
    }
    
    public void display() {
        System.out.println(msg);
    }
    
    public static void main(String [] args) {
    	Test31_Greetings g1 = new Test31_Greetings();
        Test31_Greetings g2 = new Test31_Greetings("Good Evening!");
        g1.display();
        g1.display();

        //System.out.println(null); //Unresolved compilation problem: The method println(char[]) is ambiguous for the type PrintStream
        String teste = null;
        //System.out.println(teste); //OK
    }
}
