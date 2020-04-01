package me.brunosantana.exam1.try2.package1;

abstract class Animal {
    private String name;

    Animal(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;
    Dog(String breed) { //Unresolved compilation problem: Implicit super constructor Animal() is undefined. Must explicitly invoke another constructor
    	super("Lessy"); //FIX
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class Test48 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" + 
                            dog2.getName() + ":" + dog2.getBreed());
    }
}
