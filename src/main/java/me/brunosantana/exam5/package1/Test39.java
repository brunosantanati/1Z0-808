package me.brunosantana.exam5.package1;

import java.io.IOException;
import java.sql.SQLException;

public class Test39 {
    public static void main(String[] args) {
        /*INSERT*/
    	
//    	try {
//    		save();
//    		log();
//    	}catch (SQLException | Exception e) {} //The exception SQLException is already caught by the alternative Exception
    	
//    	try {
//    		save();
//    		log();
//    	}catch (Exception | RuntimeException e) {} //The exception RuntimeException is already caught by the alternative Exception
    	
//    	try {
//    		save();
//    		log();
//    	}catch (IOException | SQLException e) {} //OK
    	
//    	try {
//    		save();
//    		log();
//    	}catch (SQLException | IOException e) {} //OK
    	
    	try {
    		save();
    		log();
    	}catch (Exception e) {} //OK
    	
//    	try {
//    		save();
//    		log();
//    	}catch (IOException | Exception e) {} //The exception IOException is already caught by the alternative Exception
    }
 
    private static void save() throws IOException {}
 
    private static void log() throws SQLException {}
}
