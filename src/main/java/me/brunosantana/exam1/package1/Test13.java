package me.brunosantana.exam1.package1;

public class Test13 {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //System.out.println(sb.append(null).length()); //Unresolved compilation problem: The method append(Object) is ambiguous for the type StringBuilder
        
        /*
         * 'append' method is overloaded in StringBuilder class: append(String), append(StringBuffer) and append(char[]) etc.
			In this case compiler gets confused as to which method `append(null)` can be tagged because String, StringBuffer and char[] are not related to each other in multilevel inheritance. Hence `sb.append(null)` causes compilation error.
         */
    }
}
