package me.brunosantana.exam2.package1;

import java.util.ArrayList;
import java.util.List;
 
class Student2 {
     private String name;
     private int age;
 
     Student2(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     public String toString() {
         return "Student[" + name + ", " + age + "]";
     }
 
     public boolean equals(Object obj) {
         if(obj instanceof Student2) {
             Student2 stud = (Student2)obj;
             if(this.name.equals(stud.name) && this.age == stud.age) {
                 return true;
             }
         }
         return false;
     }
}
 
public class Test53 {
     public static void main(String[] args) {
         List<Student2> students = new ArrayList<>();
         students.add(new Student2("James", 25));
         students.add(new Student2("James", 27));
         students.add(new Student2("James", 25));
         students.add(new Student2("James", 25));
 
         students.remove(new Student2("James", 25));
 
         for(Student2 stud : students) {
             System.out.println(stud);
         }
    }
}
