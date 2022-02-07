package me.brunosantana.exam5.package1;

//https://techvidvan.com/tutorials/java-method-overriding/
/*
1. Overriding Access-Modifiers
We can change the access modifier for an overriding method. In the derived class, while overriding a method, we can provide less restriction, but not more, restrictive access than the access of the overridden method of the superclass.
For example, the method declared as public in the super-class cannot be made private or protected while overriding it in the subclass.

2. The methods declared as ‘final’ cannot be overridden

3. The methods declared as ‘static’ cannot be overridden
Method hiding is the process of defining the static method in the derived class with the same signature as a static method in the base class.

4. Overriding Method must have the same return type (or subtype)

5. Invoking Overridden Methods from child class
We can invoke or call the method of parent class while overriding the method in the derived class using the super keyword.

6. Overriding Constructors
Constructors cannot be overridden that is the name of the constructors cannot be the same in parent and child class. Because the name of the constructor is always the same as the class name.

etc

9. Overriding and Exception-Handling in Java

Rule 1: se o método na classe pai não lança nenhuma exception, na classe filha não pode lançar nenhuma exceção checada, somente não checada
Rule 2: se o método da clase pai lança exceção, o método na classe filha pode lançar a mesma ou uma exceção filha, não pode lançar exceção pai(broader).
 */

/*
Which of the following declarations/definitions can replace INSERT such that there is no compilation error?
Select 5 options.
 */

abstract class Traveller {
    void travel(String place){}
}
 
abstract class BeachTraveller extends Traveller {
    /*INSERT*/
	//void travel(String beach) throws java.io.IOException {} //Exception IOException is not compatible with throws clause in Traveller.travel(String)
	//abstract void travel(); //OK
	//public void travel(Object obj) {} //OK
	//public void travel(String beach) throws Exception {} //Exception Exception is not compatible with throws clause in Traveller.travel(String)
	//public void travel() throws RuntimeException {} //OK
	//abstract void travel(String beach); //OK
	public abstract void travel(); //OK
}

//MY TESTS

class AAA{
	void aaa() throws RuntimeException {}
}

class BBB extends AAA{
	//void aaa() throws ArithmeticException {} //OK
	//void aaa() {} //OK
	//void aaa() throws Exception {} //Exception Exception is not compatible with throws clause in AAA.aaa()
}

public class Test51 {

}
