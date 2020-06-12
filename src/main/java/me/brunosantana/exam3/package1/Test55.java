package me.brunosantana.exam3.package1;

class Point {
    static int x;
    private int y;
}

public class Test55 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 17;
        //p1.y = 35; //Unresolved compilation problems: The field Point.y is not visible
        p2.x = 19;
        //p2.y = 40; //Unresolved compilation problems: The field Point.y is not visible

        //System.out.println(p1.x + ":" + p1.y + ":" + p2.x + ":" + p2.y); //Unresolved compilation problems: The field Point.y is not visible
        System.out.println(p1.x + " - " + p2.x); //FIX
    }
}
