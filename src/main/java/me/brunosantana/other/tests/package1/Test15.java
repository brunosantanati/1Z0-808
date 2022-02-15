package me.brunosantana.other.tests.package1;

//Operator Precedence
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html

/*
Operators	Precedence
postfix	expr++ expr--
unary	++expr --expr +expr -expr ~ !
multiplicative	* / %
additive	+ -
shift	<< >> >>>
relational	< > <= >= instanceof
equality	== !=
bitwise AND	&
bitwise exclusive OR	^
bitwise inclusive OR	|
logical AND	&&
logical OR	||
ternary	? :
assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=
 */

public class Test15 {
	public static void main(String [] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        boolean flag4 = false;
        
        //System.out.println(!flag1 == flag2 != flag3 == !flag4); //Line n1
        System.out.println((((!flag1) == flag2) != flag3) == (!flag4));
        
        //System.out.println(flag1 = flag2 != flag3 == !flag4); //Line n2
        System.out.println(flag1 = ((flag2 != flag3) == (!flag4)));
        
        System.out.println(flag1 = !flag3);
        System.out.println(flag1);
    }
}
