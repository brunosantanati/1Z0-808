package me.brunosantana.exam5.package1;

class Square1 {
    int length;
    Square1 sq;
    
    Square1(int length) {
        this.length = length;
    }
    
    void setInner(Square1 sq) {
        this.sq = sq;
    }
    
    int getLength() {
        return this.length;
    }
}
 
public class Test31 {
    public static void main(String[] args) {
    	Square1 sq1 = new Square1(10); //Line n1
    	Square1 sq2 = new Square1(5); //Line n2
        sq1.setInner(sq2); //Line n3
        System.out.println(sq1.sq.length); //Line n4
    }
}