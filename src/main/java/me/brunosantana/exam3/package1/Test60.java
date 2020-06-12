package me.brunosantana.exam3.package1;

public class Test60 {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
        	System.out.printf("start: %s - sum: %s\n", start, sum);
        	
            if(start % 2 == 0) {
                continue;
            }
            sum += start;
        } while(++start <= 10);
        System.out.println(sum);
    }
}
