package me.brunosantana.exam3.package1;

//Which 3 options, if used to replace /*INSERT*/, on execution will print 9 on to the console?
public class Test44 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int x = 0;
        //for(/*INSERT*/) {
        //for(int n=1; n < arr.length - 1; n++) { //it prints 9
        //for(int n=0; n < arr.length; n += 2) { //it prints 9
        for(int n=3; n < arr.length; n++) { //it prints 9
            x += arr[n];
        }
        System.out.println(x);
    }
}

/*
Logic in for loop is adding array elements. You need to find out which array elements when added will 
result in 9. Possible options are: {1+3+5, 2+3+4, 4+5}.

Based on these 3 combinations you can select 3 correct options.
 */
