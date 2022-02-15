package me.brunosantana.other.tests.package1;

//Only thing to remember is that if overridden method throws any unchecked exception or Error, then overriding method must not throw any checked exceptions.

class Animal{
	void punch() throws RuntimeException{
	//void punch() throws Error{
		System.out.println("punch");
	}
}

class NinjaTurtle extends Animal{
	
	//void punch() throws Exception { //Exception Exception is not compatible with throws clause in Animal.punch()
	//void punch() throws RuntimeException{ //OK
	void punch() {
		System.out.println("Turtle punch");
	}
	
}

public class Test16 {
	
	public static void main(String[] args) {
		new NinjaTurtle().punch();
	}

}
