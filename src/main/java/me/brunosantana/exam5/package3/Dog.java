package me.brunosantana.exam5.package3;

import me.brunosantana.exam5.package2.Animal;

public class Dog extends Animal {
    public Dog() { //Implicit super constructor Animal() is not visible. Must explicitly invoke another constructor
        System.out.print("DOG");
    }
}
