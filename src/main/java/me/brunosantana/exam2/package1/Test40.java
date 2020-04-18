package me.brunosantana.exam2.package1;

public class Test40 {}

abstract class Player {
    protected void play() {

    }

    abstract void run();
}

class FootballPlayer extends Player {
    //void play() {
	//public void play() { //FIX
	protected void play() { //FIX

    }

    protected void run() {

    }
}

/*
 * I understood that the method that overrides another, should have a equal or greater access modifier.
 * The access modifier must not be minor the modifier in the method in the father's class. 
 */
