package me.brunosantana.exam4.package1;

//Which 2 changes are necessary so that code compiles successfully?
import java.io.IOException;

class ReadTheFile {
     static void print() throws IOException { //Line 4 //add throws IOException
         throw new IOException(); //Line 5
     }
}
 
public class Test48 {
     public static void main(String[] args) { //Line 10
    	 try {
    		 ReadTheFile.print(); //Line 11 //surround with try catch
    	 }catch(IOException e) {
    		 e.printStackTrace();
    	 }
         //Line 12
     }
}