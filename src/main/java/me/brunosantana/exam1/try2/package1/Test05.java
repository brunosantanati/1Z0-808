package me.brunosantana.exam1.try2.package1;

public class Test05 {
	public static void main(String[] args) {
//        short [] args = new short[]{50, 50}; //Unresolved compilation problem: Duplicate local variable args
//        args[0] = 5;
//        args[1] = 10;
//        System.out.println("[" + args[0] + ", " + args[1] + "]");
		
		//FIX
		short [] args2 = new short[]{50, 50};
        args2[0] = 5;
        args2[1] = 10;
        System.out.println("[" + args2[0] + ", " + args2[1] + "]");
    }
}
