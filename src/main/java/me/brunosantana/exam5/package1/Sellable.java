package me.brunosantana.exam5.package1;

public interface Sellable {
    double getPrice();
    
    default String symbol() {
        return "$";
    }
}
