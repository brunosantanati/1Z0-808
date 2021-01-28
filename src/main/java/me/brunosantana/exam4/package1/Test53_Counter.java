package me.brunosantana.exam4.package1;

//On executing Counter class, how many Counter objects are created in the memory?
public class Test53_Counter {
    int count;

    private static void increment(Test53_Counter counter) {
        counter.count++;
    }

    public static void main(String [] args) {
    	Test53_Counter c1 = new Test53_Counter();
    	Test53_Counter c2 = c1;
    	Test53_Counter c3 = null;
        c2.count = 1000;
        increment(c2);
    }
}
