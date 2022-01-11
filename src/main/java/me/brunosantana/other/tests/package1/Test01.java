package me.brunosantana.other.tests.package1;

import java.io.IOException;
import java.rmi.RemoteException;

class Parent {
	public void method1() throws IOException{
		System.out.println("parent");
	}
}

class Child extends Parent {
	
	@Override
	//public void method1() throws Exception{ //Exception Exception is not compatible with throws clause in Parent.method1()
	//public void method1() throws IOException{ //OK
	public void method1() throws RemoteException{ //OK, RemoteException is a subclass of IOException
		System.out.println("child");
	}
}

public class Test01 {
	public static void main(String[] args) throws Exception {
		new Child().method1();
	}
}
