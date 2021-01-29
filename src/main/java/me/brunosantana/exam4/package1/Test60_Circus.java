package me.brunosantana.exam4.package1;

class Animal2 {
    protected void jump() {
        System.out.println("Animal");
    }
}

class Cat extends Animal2 {
    public void jump(int a) {
        System.out.println("Cat");
    }
}

class Deer extends Animal2 {
    public void jump() {
        System.out.println("Deer");
    }
}

public class Test60_Circus {
    public static void main(String[] args) {
        Animal2 cat = new Cat();
        Animal2 deer = new Deer();
        cat.jump();
        deer.jump();
    }
}