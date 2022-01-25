package me.brunosantana.exam5.package1;

abstract class Profit implements Profitable1, Profitable2 { //Duplicate default methods named profit with the parameters () and () are inherited from the types Profitable2 and Profitable1
    /*INSERT*/
	public double profit() {
		return Profitable2.super.profit();
	}
	
//	double profit() { //Cannot reduce the visibility of the inherited method from Profitable2
//		return 50.0;
//	}
	
//	public default double profit() { //Default methods are allowed only in interfaces.
//		return 50.0;
//	}
	
//	protected double profit() { //Cannot reduce the visibility of the inherited method from Profitable2
//		return 50.0;
//	}
	
//	public double profit() {
//		return Profitable1.profit(); //Cannot make a static reference to the non-static method profit() from the type Profitable1
//	}
}

public class Test20 extends Profit{
	public static void main(String[] args) {
		System.out.println(new Test20().profit());
		System.out.println(new Xpto().profit());
	}
}

//MY TEST
class Xpto implements Profitable1{
}
