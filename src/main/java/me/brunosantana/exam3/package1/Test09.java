package me.brunosantana.exam3.package1;

public class Test09 {
    static Boolean[] arr = new Boolean[1];
    public static void main(String[] args) {
    	arr[0] = true; //FIX
        if(arr[0]) { //Exception in thread "main" java.lang.NullPointerException
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

/*
All the array elements are initialized to their default values. 
arr is of Boolean type (reference type), so arr[0] is initialized to null.

if expression works with Boolean type variable, so "if(arr[0])" doesn't give compilation error
but java runtime extracts the boolean value stored in arr[0] and it uses booleanValue() method.

arr[0].booleanValue() means booleanValue() method is invoked on null reference and hence
NullPointerException is thrown at runtime.
 */
