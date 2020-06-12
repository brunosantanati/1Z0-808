package me.brunosantana.exam3.package2;

public class Counter {
    public int count = 0;

    public Counter(int start) {
        count = start;
    }

    public int getCount() {
        return count;
    }

    public void change(int val) {
        count += val;
    }
}
