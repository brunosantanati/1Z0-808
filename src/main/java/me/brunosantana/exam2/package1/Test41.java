package me.brunosantana.exam2.package1;

class Vehicle {
    public int getRegistrationNumber() {
        return 1;
    }
}

//class Car {
class Car extends Vehicle { //FIX
    public int getRegistrationNumber() {
        return 2;
    }
}

public class Test41 {
    public static void main(String[] args) {
        Vehicle obj = new Car(); //Unresolved compilation problem: Type mismatch: cannot convert from Car to Vehicle
        System.out.println(obj.getRegistrationNumber());
    }
}