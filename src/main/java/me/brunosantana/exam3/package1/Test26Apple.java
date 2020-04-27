package me.brunosantana.exam3.package1;

//For the class Test26Apple, which option, if used to replace /*INSERT*/, will print GREEN on to the console?
public class Test26Apple {
    public String color;

    public Test26Apple(String color) {
        /*INSERT*/
    	this.color = color;
    }

    public static void main(String [] args) {
    	Test26Apple apple = new Test26Apple("GREEN");
        System.out.println(apple.color);
    }
}
