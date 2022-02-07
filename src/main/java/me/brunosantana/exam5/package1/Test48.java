package me.brunosantana.exam5.package1;

/*
1. abstract class Work implements Workable
2. class Work implements Workable
3. interface Work extends Workable
4. abstract interface Work extends Workable
5. abstract class Work

How many statements can replace INSERT such that there is no compilation error?
3
 */

interface Workable {
    void work();
}
 
/*INSERT*/
abstract class Work implements Workable{ //OK
//class Work implements Workable{ //OK
//interface Work extends Workable{ //Abstract methods do not specify a body
//abstract interface Work extends Workable{ //Abstract methods do not specify a body
//abstract class Work{ //OK
    public void work() {} //Line n1
}

public class Test48 {

}
