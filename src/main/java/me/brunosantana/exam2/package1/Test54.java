package me.brunosantana.exam2.package1;

/* For the class Test, which options, if used to replace /INSERT/, 
 * will print "apple mango orange grape " on to the console?
 */
public class Test54 {
    public static void main(String[] args) {
        String [][] fruits = {{"apple", "mango"}, {"orange", "grape"}};
        /*INSERT*/
        for(int i=0; i < fruits.length; i++)
        	for(int j=0; j < fruits[i].length; j++)
        		System.out.println(fruits[i][j] + " ");
        
        System.out.println("========================");
        
        for(String [] arr : fruits)
        	for(String fruit : arr)
        		System.out.println(fruit + " ");
    }
}
