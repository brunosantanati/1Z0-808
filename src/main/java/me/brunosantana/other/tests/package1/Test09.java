package me.brunosantana.other.tests.package1;

class RRR{
	void teste() {
		
	}
}

class TTT extends RRR{
	//private void teste() { //Cannot reduce the visibility of the inherited method from RRR
	//void teste() { //OK
	//public void teste() { //OK
	protected void teste() { //OK
	}
}

public class Test09 {
	
	public static void main(String[] args) {
		
	}

}
