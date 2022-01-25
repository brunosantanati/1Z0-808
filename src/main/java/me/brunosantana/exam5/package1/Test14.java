package me.brunosantana.exam5.package1;

interface ILogger {
    void log();
}

public class Test14 {
    public static void main(String[] args) {
        ILogger [] loggers = new ILogger[2]; //Line n1
        //System.out.println(loggers.length);
        for(ILogger logger : loggers)
            logger.log(); //Line n2 //Exception in thread "main" java.lang.NullPointerException
    }
}
