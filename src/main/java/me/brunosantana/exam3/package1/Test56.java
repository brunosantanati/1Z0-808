package me.brunosantana.exam3.package1;

//Does below code compile successfully?
public class Test56 {
    public static void main(String [] args) {
        System.out.println("Hello");;;;;;;;; //YES
        
        //EXPLANATION:
        
        //In java, it is allowed to put multiple statements on one line. E.g. below code is legal:
        String symbol = "!";System.out.print("Hello ");System.out.print("World");System.out.println(symbol);
        
        //Above code is similar to:
        String symbol2 = "!";
        System.out.print("Hello ");
        System.out.print("World");
        System.out.println(symbol2);
        
        //Empty statements (just the semicolon) are also allowed in java, 
        //therefore below code is also legal:
        System.out.println("Hello");
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        
        //As shown above, java statements (including empty statements) can be placed on one line, 
        //therefore below code is legal:
        System.out.println("Hello");;;;;;;;;
    }
}
