package me.brunosantana.exam4.package1;

class Document {
    int pages;
    Document(int pages) {
        this.pages = pages;
    }
}
 
class Word extends Document {
    String type;
    Word(String type) {
        super(20); //default pages
        /*INSERT-1*/
        this.type = type; //FIX
    }
    
    Word(int pages, String type) {
        /*INSERT-2*/
    	this(type); //FIX
        super.pages = pages;
    }
}
 
public class Test62 {
    public static void main(String[] args) {
        Word obj = new Word(25, "TEXT");
        System.out.println(obj.type + "," + obj.pages);
    }
}