package me.brunosantana.other.tests.package1;

import java.io.IOException;

class Jedi{
	void power() {
		System.out.println("power");
	}
}

class ObiWanKenobi extends Jedi{
	//void power() throws IOException{ //Exception IOException is not compatible with throws clause in Jedi.power()
	//void power() throws Exception{ //Exception Exception is not compatible with throws clause in Jedi.power()
	//void power() throws RuntimeException { //OK
	void power() {
		System.out.println("powerrr");
	}
}

public class Test20 {
	public static void main(String[] args) throws IOException {
		new ObiWanKenobi().power();
	}
}
