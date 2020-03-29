package me.brunosantana.exam1.try2.package1;

import java.util.ArrayList;

class Counter {
    int count;
    Counter(int count) {
        this.count = count;
    }

    public String toString() {
        return "Counter-" + count;
    }
}

public class Test14 {
    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));

        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
        cloned.get(0).count = 5;

        System.out.println(original);
    }
}
