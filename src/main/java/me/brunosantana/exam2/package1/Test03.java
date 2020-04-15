package me.brunosantana.exam2.package1;

public class Test03 {
    public static void main(String[] args) {
        int score = 60;
        switch (score) {
            default:
                System.out.println("Not a valid score");
            //case score < 70: //Unresolved compilation problems: Type mismatch: cannot convert from boolean to int
            case 70:
                System.out.println("Failed");
                break;
            //case score >= 70: //Unresolved compilation problems: Type mismatch: cannot convert from boolean to int
            case 60:
                System.out.println("Passed");
                break;
        }
    }
}

/* 
 * 
 * switch expression can accept following: 

	char or Character, 
	
	byte or Byte, 
	
	short or Short, 
	
	int or Integer, 
	
	An enum only from Java 6, 
	
	A String expression only from Java 7.  
 * 
 */
