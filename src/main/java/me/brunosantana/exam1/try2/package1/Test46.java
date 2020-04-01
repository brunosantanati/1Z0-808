package me.brunosantana.exam1.try2.package1;

class PenDrive {
    int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }
}

class OTG extends PenDrive {
    String type;
    OTG(int capacity, String type) {
        //TODO
    	super(capacity);
    	this.type = type;
    }
}

public class Test46 {
    public static void main(String[] args) {
        OTG obj = new OTG(64, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);
    }
}
