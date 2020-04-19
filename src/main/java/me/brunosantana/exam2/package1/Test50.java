package me.brunosantana.exam2.package1;

public class Test50 {
    public static void main(String[] args) {
        /*INSERT*/
    	//char var = 10; //OK
    	//byte var = 10; /OK
    	//Integer var = 10; //OK
    	Short var = 10; //OK
    	
        switch(var) {
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}

/*
 * switch can accept primitive types: byte, short, int, char; 
 * wrapper types: Byte, Short, Integer, Character; String and enums.
 * In this case long and double are invalid values to be passed in switch expression. 
 * char uses 16 bits (2 Bytes) and its range is 0 to 65535 (no signed bit reserved) so 
 * it can easily store value 10. 
*/
