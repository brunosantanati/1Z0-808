package me.brunosantana.exam1.package1;

public class Test29 {
	public static void main(String[] args) {
        
		//char var = 7;
		//Character var = '7';
		//Integer var = 7;
		//char var = '7';
		Character var = 7;
		System.out.println(var);
		
		/*
		 * switch can accept primitive types: byte, short, int, char; 
		 * wrapper types: Byte, Short, Integer, Character; 
		 * String and enums.
		 * 
		 */
        switch(var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
