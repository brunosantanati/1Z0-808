package me.brunosantana.exam4.package1;

public class Test17 {
    public static void main(String[] args) {
        final boolean flag;
        flag = false;
        //flag = true; //If maintain this line and above occurs compilcation error: The final local variable flag may already have been assigned
        while(flag) {
            System.out.println("Good Morning!");
        }
    }
}
