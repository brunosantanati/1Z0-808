package me.brunosantana.exam5.package1;

interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}
 
abstract class Log {
    public static void log() { 
        System.out.println("Log");
    }
}
 
//class MyLogger extends Log implements ILog {} //The static method log() conflicts with the abstract method in ILog

public class Test43 {

}
