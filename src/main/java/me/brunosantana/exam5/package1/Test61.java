package me.brunosantana.exam5.package1;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.Arrays;

interface Multiplier {
    void multiply(int... x) throws SQLException;
}
 
class Calculator implements Multiplier {
    //public void multiply(int... x) throws /*INSERT*/ {
	//public void multiply(int... x) throws IOException { //Exception IOException is not compatible with throws clause in Multiplier.multiply(int[])
	//public void multiply(int... x) throws Error { //OK
	//public void multiply(int... x) throws SQLWarning { //OK
	//public void multiply(int... x) throws SQLException { //OK
	//public void multiply(int... x) throws NullPointerException { //OK
	//public void multiply(int... x) throws Throwable { //Exception Throwable is not compatible with throws clause in Multiplier.multiply(int[])
	//public void multiply(int... x) throws Exception { //Exception Exception is not compatible with throws clause in Multiplier.multiply(int[])
	public void multiply(int... x) throws RuntimeException { //OK
		//MY TEST
		System.out.println(Arrays.stream(x).reduce(1, (a, b) -> {
			return a * b;
		}));
    }
}
public class Test61 {
    public static void main(String[] args) {
        try {
            Multiplier obj = new Calculator(); //Line n1
            obj.multiply(1, 2, 3);
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}
