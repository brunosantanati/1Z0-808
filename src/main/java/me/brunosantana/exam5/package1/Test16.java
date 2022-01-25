package me.brunosantana.exam5.package1;


import java.sql.SQLException;
 
public class Test16 {
    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw e;
        }
    }
 
    public static void main(String[] args) {
        try {
            m();
        } catch(SQLException e) {
            System.out.println("CAUGHT SUCCESSFULLY");
        }
    }
}
