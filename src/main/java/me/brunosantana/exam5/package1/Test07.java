package me.brunosantana.exam5.package1;

class M {
    public void main(String[] args) { //Line n1
        System.out.println("M");
    }
}
 
class N extends M {
    //public static void main(String[] args) { //Line n2 //This static method cannot hide the instance method from M
    public static void other(String[] args) { //FIX    
    	new M().main(args); //Line n3
    }
}
 
public class Test07 {
    public static void main(String[] args) {
        //N.main(args); //Line n4
    	N.other(args); //FIX
    }
}
