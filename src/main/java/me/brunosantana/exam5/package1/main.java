package me.brunosantana.exam5.package1;

//Test02
public class main {
    static String main = "ONE";
    
    public main() {
        System.out.println("TWO");
    }
    
    public static void main(String [] args) {
        main();
    }
    
    public static void main() {
        System.out.println(main);
    }
}
