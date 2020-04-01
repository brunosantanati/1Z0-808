package me.brunosantana.exam1.try2.package1;

class Student3 {
    String name;
    int age;

    void Student() {
        Student("James", 25);
    }

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Test37 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        System.out.println(s.name + ":" + s.age);
    }
}
