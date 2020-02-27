package me.brunosantana.exam1.package1;

public class Test22 {
	public static void main(String[] args) {
        int x = 1;
        while(checkAndIncrement(x)) { //infinite loop
            System.out.println(x);
        }
    }

    private static boolean checkAndIncrement(int x) { //pass-by-value
        if(x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }
}
