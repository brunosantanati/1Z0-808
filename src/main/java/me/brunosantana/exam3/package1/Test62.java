package me.brunosantana.exam3.package1;

import java.util.ArrayList;
import java.util.List;
 
class Student1 {
     private String name;
     private int age;
 
     Student1(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     public String toString() {
         return "Student[" + name + ", " + age + "]";
     }
 
     //equals(Object) method has NOT been overridden by the Student1 class. 
     //In fact, equals(Student1) is overloaded. But overloaded version is not invoked while equating the Student objects.
     //equals(Object) method defined in Object class is invoked and equals(Object) method defined in 
     //Object class uses == operator to check the equality and in this case as all the Student objects are stored at different memory location, hence not equal.
     public boolean equals(Student1 obj) {
         if(obj instanceof Student1) {
        	 Student1 stud = (Student1)obj;
             if(this.name.equals(stud.name) && this.age == stud.age) {
                 return true;
             }
         }
         return false;
     }
}
 
public class Test62 {
     public static void main(String[] args) {
         List<Student1> students = new ArrayList<>();
         students.add(new Student1("James", 25));
         students.add(new Student1("James", 27));
         students.add(new Student1("James", 25));
         students.add(new Student1("James", 25));
 
         students.remove(new Student1("James", 25));
 
         for(Student1 stud : students) {
             System.out.println(stud);
         }
     }
}
