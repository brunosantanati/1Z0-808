package me.brunosantana.exam2.package1;

public class Test27 {
	public static void main(String [] args) {
        int a = 2;
        boolean res = false;
        //res = a++ == 2 || --a == 2 && --a == 2;
        res = ((a++) == 2) || (((--a) == 2) && ((--a) == 2));
        //precedence: Postfix, Prefix, ==, &&, ||
        System.out.println(a);
    }
}

/*
Explanation

a++ == 2 || --a == 2 && --a == 2; [Given expression]. 

(a++) == 2 || --a == 2 && --a == 2; [Postfix has got higher precedence than other operators]. 

(a++) == 2 || (--a) == 2 && (--a) == 2; [After postfix, precedence is given to prefix].   

((a++) == 2) || ((--a) == 2) && ((--a) == 2); [== has higher precedence over && and ||]. 

((a++) == 2) || (((--a) == 2) && ((--a) == 2)); [&& has higher precedence over ||]. 

Let's start solving it:

((a++) == 2) || (((--a) == 2) && ((--a) == 2)); [a=2, res=false]. 

(2 == 2) || (((--a) == 2) && ((--a) == 2)); [a=3, res=false]. 

true || (((--a) == 2) && ((--a) == 2)); [a=3, res=false].  || is a short-circuit operator, hence no need to evaluate expression on the right. 

res is true and a is 3. 
*/