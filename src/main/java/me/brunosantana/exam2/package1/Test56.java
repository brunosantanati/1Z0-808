package me.brunosantana.exam2.package1;

import java.io.FileNotFoundException;
import java.io.IOException;
 
abstract class Super {
     public abstract void m1() throws IOException;
}
 
class Sub extends Super {
     @Override
     public void m1() throws IOException {
         throw new FileNotFoundException();
     }
}
 
public class Test56 {
     public static void main(String[] args) {
         Super s = new Sub();
         try {
             s.m1();
         } catch (IOException e) {
             System.out.print("A");
//         } catch(FileNotFoundException e) { //Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOException
//             System.out.print("B");
         } finally {
             System.out.print("C");
         }
     }
}
