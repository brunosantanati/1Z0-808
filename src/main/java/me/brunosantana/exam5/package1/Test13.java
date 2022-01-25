package me.brunosantana.exam5.package1;

class Shape {
    int side = 0; //Line n1
 
    int getSide() { //Line n2
        return side;
    }
}
 
class Square extends Shape {
    private int side = 4; //Line n3
 
    protected int getSide() { //Line n4
        return side;
    }
}
 
public class Test13 {
    public static void main(String[] args) {
        Shape s = new Square();
        System.out.println(s.side + ":" + s.getSide());
    }
}

