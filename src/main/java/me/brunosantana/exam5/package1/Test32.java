package me.brunosantana.exam5.package1;

import java.sql.SQLException;

public class Test32 {
    private static void availableSeats() throws SQLException {
        throw null; //Line 7 //Exception in thread "main" java.lang.NullPointerException
    }
 
    public static void main(String[] args) {
        try {
            availableSeats(); //Line 12
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }
    }
}
