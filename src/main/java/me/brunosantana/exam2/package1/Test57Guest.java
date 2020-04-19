package me.brunosantana.exam2.package1;

class Message {
    public static void main(String [] args) {
        System.out.println("Welcome! " + args[1]);
    }
}

//programm arguments: java Test57Guest James Gosling
public class Test57Guest {
    public static void main(String [] args) {
        Message.main(args);
    }
}

/*
 * Both the classes contain special main method. No compilation error with the code: 
 * file is correctly names as Guest.java - in my case Test57Guest.java - (name of public class).

 * `java Guest James Gosling` passes new String [] {"James", "Gosling"} to args of Guest.main method.

 * Apart from being special main method, Message.main is static method so Guest.main method invokes 
 * Message.main method with the same argument: new String [] {"James", "Gosling"}. args[1] is
 * "Gosling" hence "Welcome! Gosling" gets printed on to the console.
*/
