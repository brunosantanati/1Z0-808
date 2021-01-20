package me.brunosantana.exam4.package1;

/*
doc: https://docs.oracle.com/javase/7/docs/api/java/lang/OutOfMemoryError.html

java.lang.Object
	java.lang.Throwable
		java.lang.Error
			java.lang.VirtualMachineError
				java.lang.OutOfMemoryError
 */

public class Test39 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            for(;;) { //Loop infinito causa: java.lang.OutOfMemoryError: Java heap space
                sb.append("OCA");
            }
        } catch(Exception e) {
            System.out.println("Exception!!!");
        }
        //my test
        /*catch(Error e) {
        	System.out.println("Error!!");
        }*/
        System.out.println("Main ends!!!");
    }
}
