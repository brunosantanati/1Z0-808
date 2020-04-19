package me.brunosantana.exam2.package1;

class Point {
    static int x;
    int y;
}

public class Test60 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 17;
        p1.y = 35;
        p2.x = 19;
        p2.y = 40;

        System.out.println(p1.x + ":" + p1.y + ":" + p2.x + ":" + p2.y);
    }
}
