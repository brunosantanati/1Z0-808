package me.brunosantana.exam5.package1;

class Book {
    private String name;
    private String author;
    
    Book() {}
    
    Book(String name, String author) {
        //name = name; //The assignment to variable name has no effect
        //author = author;
    	this.name = name; //FIX
    	this.author = author; //FIX
    }
    
    String getName() {
        return name;
    }
    
    String getAuthor() {
        return author;
    }
}
 
public class Test27 {
    public static void main(String[] args) {
        //private Book book = new Book("Head First Java", "Kathy Sierra");
    	Book book = new Book("Head First Java", "Kathy Sierra"); //FIX
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}
