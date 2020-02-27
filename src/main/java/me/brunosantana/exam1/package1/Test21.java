package me.brunosantana.exam1.package1;

class Test21 {
	public static void main(String[] args) {
        
		int grade = 60;
        boolean anything = false;
        
        //if(grade = 60) //Unresolved compilation problem: Type mismatch: cannot convert from int to boolean
        if(anything = true) //A boolean assignment is OK
            System.out.println("You passed...");
        else
            System.out.println("You failed...");
    }
}
