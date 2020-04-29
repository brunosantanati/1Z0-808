package me.brunosantana.exam3.package1;

public class Test28 {
    public static void main(String[] args) {
        //for: //Unresolved compilation problems: Syntax error on token "for", invalid Label
    	test:
        for (int i = 2; i <= 100; i = i + 2) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
            if(i == 10) {
                //break for; //Unresolved compilation problems: Syntax error on token "for", invalid Expression
            	break test;
            }
        }
    }
}

/*
for is a keyword and hence can't be used as a label.

Java labels follow the identifier naming rules and one rule is that we can't use java keywords 
as identifier. Hence, Compilation error.
*/