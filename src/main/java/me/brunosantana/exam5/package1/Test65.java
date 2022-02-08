package me.brunosantana.exam5.package1;

//Consider below code of Test.java file:

public class Test65 {
    public static void main(String[] args) {
        //int[][] arr = new int[x][y]; //Line n1
    	//int[][] arr = new int[6][6]; //Line n1
    	//int[][] arr = new int[2][5]; //Line n1
    	//int[][] arr = new int[4][7]; //Line n1
    	//int[][] arr = new int[7][7]; //Line n1
    	//int[][] arr = new int[8][8]; //Line n1
    	//int[][] arr = new int[0][0]; //Line n1
    	int[][] arr = new int[-1][-1]; //Line n1
        arr[1][4] = 100;
        arr[6][6] = 200;
        arr[3][6] = 300;
    }
}

/*
And below combination of x and y values:

1. x = 6, y = 6
2. x = 2, y = 5
3. x = 4, y = 7
4. x = 7, y = 7
5. x = 8, y = 8
6. x = 0, y = 0
7. x = -1, y = -1

How many of above x,y pair(s) can replace x and y at Line n1 such that Test.java file compiles successfully?
 */
