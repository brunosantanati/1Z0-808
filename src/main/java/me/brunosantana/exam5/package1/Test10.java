package me.brunosantana.exam5.package1;

import java.util.ArrayList;
import java.util.List;

class Father {}

class Son extends Father {}
 
class GrandSon extends Son {}
 
abstract class Super {
    abstract List<Father> get();
}
 
class Sub extends Super {
    /*INSERT*/
//	List<Father> get() {return null;}
	ArrayList<Father> get() {return null;}
//	List<Son> get() {return null;} //The return type is incompatible with Super.get()
//	ArrayList<Son> get() {return null;} //The return type is incompatible with Super.get()
//	List<GrandSon> get() {return null;} //The return type is incompatible with Super.get()
//	ArrayList<GrandSon> get() {return null;} //The return type is incompatible with Super.get()
//	List<Object> get() {return null;} //The return type is incompatible with Super.get()
//	ArrayList<Object> get() {return null;} //The return type is incompatible with Super.get()
}

public class Test10 {
	public static void main(String[] args) {
		System.out.println(new Sub().get());
	}
}
