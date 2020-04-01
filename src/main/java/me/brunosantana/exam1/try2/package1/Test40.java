package me.brunosantana.exam1.try2.package1;

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
 
public class Test40 {
     public static void main(String[] args) {
         Super s = new Sub();
         try {
             s.m1(); //Unresolved compilation problem: Unhandled exception type IOException
         } catch (FileNotFoundException e) {
             System.out.print("M");
         } catch (IOException e) { //FIX
			e.printStackTrace();
		} finally {
             System.out.print("N");
         }
     }
}
