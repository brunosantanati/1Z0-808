package me.brunosantana.other.tests.package1;

class Square {
    int length;
    Square sq;
    
    Square(int length) {
        this.length = length;
    }
    
    void setInner(Square sq) {
        this.sq = sq;
    }
    
    int getLength() {
        return this.length;
    }
}
