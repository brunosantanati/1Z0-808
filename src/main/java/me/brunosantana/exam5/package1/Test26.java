package me.brunosantana.exam5.package1;


abstract class Food {
    //protected abstract double getCalories();
	abstract double getCalories(); //FIX3
}
 
class JunkFood extends Food {
    double getCalories() { //Cannot reduce the visibility of the inherited method from Food
	//protected double getCalories() { //FIX1
	//public double getCalories() { //FIX2
        return 200.0;
    }
}

public class Test26 {

}
