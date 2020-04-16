package me.brunosantana.exam2.package1;

class Student {
    String name;
    int age;

    Student() {
        //Student("James", 25); //Unresolved compilation problem: The method Student(String, int) is undefined for the type Student
    	this("James", 25);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Test09 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
