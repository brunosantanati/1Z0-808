package me.brunosantana.other.tests.package1;

class B{
	public void m1(String x) {
		System.out.println("B.m1");
	}
}

class C extends B{
	//public static void m1(String x) { //This static method cannot hide the instance method from B
	public static void m1(int x) { //OK
	//public static int m1(String x) { //This static method cannot hide the instance method from B
		System.out.println("C.m1");
	}
}

public class Test05 {
	public static void main(String[] args) {
		new B().m1("");
		C.m1(10);
	}
}
