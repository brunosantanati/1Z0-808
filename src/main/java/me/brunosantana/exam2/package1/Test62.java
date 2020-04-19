package me.brunosantana.exam2.package1;

//How many statement(s) cause(s) compilation failure?
public class Test62 {
    public static void main(String[] args) {
        long l = 100_00l;
        int i = 100;
        float f = 2.02f; 
        double d = 10_0.35d;
        f = l;
        d = l;
        //f = d;
        d = f;
        f = i;
        //i = f;
        i = (int)d;
    }
}

/*
For readability purpose underscore (_) is used to separate numeric values. This is very useful in representing big numbers such as credit card numbers (1234_7654_9876_0987). long data can be suffixed by l, float by f and double by d. So first 4 variable declaration and assignment statements don't cause any compilation error.


long can be easily assigned to float and double type variables, hence no issues with f = l; and d = l;

double can't be assigned to float without explicit casting, so f = d; causes compilation error.


float can easily be assigned to double and int can easily be assigned to float, so d = f; and f = i; compiles successfully.

float can't be assigned to int without explicit casting, so i = f; causes compilation error.


double can't be assigned to int without explicit casting, statement i = (int)d; is casting double to int, so no issues.


In total, 2 statements are causing compilation error: f = d; and i = f;
*/