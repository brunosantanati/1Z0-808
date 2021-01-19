package me.brunosantana.exam4.package1;

class Student {
    String name;
    int age;

    Student() {
        //Student("James", 25); //The method Student(String, int) is undefined for the type Student
    	this("James", 25); //FIX
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Test22 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
