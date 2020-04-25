package me.brunosantana.exam3.package1;

public class Test06 {
    public static void main(String[] args) {
        int a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);
    }
}

/*

Explanation

int var = --a * a++ + a-- - --a;

int var = --a * (a++) + (a--) - --a;

int var = (--a) * (a++) + (a--) - (--a);

int var = ((--a) * (a++)) + (a--) - (--a);

int var = (((--a) * (a++)) + (a--)) - (--a);

int var = ((19 * (a++)) + (a--)) - (--a); //a = 19

int var = ((19 * 19) + (a--)) - (--a); //a = 20

int var = (361 + 20) - (--a); //a = 19

int var = 381 - (--a); //a = 19

int var = 381 - 18; //a = 18

int var = 363 // a = 18

So,

a = 18

var = 363
 
*/
