package me.brunosantana.exam3.package1;

import java.io.FileNotFoundException;

public class Test32 {
     public static void main(String[] args) {
         try {
             System.out.println(1);
         } catch (NullPointerException ex) {
             System.out.println("ONE");
         /*} catch (FileNotFoundException ex) { //Unresolved compilation problem: Unreachable catch block for FileNotFoundException. This exception is never thrown from the try statement body
             System.out.println("TWO");*/
         }
         System.out.println("THREE");
     }
}

/*
Java doesn't allow to catch specific checked exceptions if these are not thrown by the statements 
inside try block.

catch(FileNotFoundException ex) {} causes  compilation error in this case as System.out.println(1); 
will never throw FileNotFoundException.


NOTE: Java allows to catch Exception type. catch(Exception ex) {} will never cause compilation error.
*/
