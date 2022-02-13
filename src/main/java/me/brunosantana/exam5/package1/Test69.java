package me.brunosantana.exam5.package1;

class Lock {
    public void open() {
        System.out.println("LOCK-OPEN");
    }
}
 
class Padlock extends Lock {
    public void open() {
        System.out.println("PADLOCK-OPEN");
    }
}
 
class DigitalPadlock extends Padlock {
    public void open() {
        /*INSERT*/
    	//((Lock)super).open(); //NOK
    	//(Lock)super.open(); //NOK
    	//super.super.open(); //NOK
    	super.open();
    }
}
 
public class Test69 {
    public static void main(String[] args) {
        Lock lock = new DigitalPadlock();
        lock.open();
    }
}
