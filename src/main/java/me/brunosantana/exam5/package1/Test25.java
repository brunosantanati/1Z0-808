package me.brunosantana.exam5.package1;

class Report {
    public String generateReport() {
        return "CSV";
    }
    
    //public Object generateReport() { //Duplicate method generateReport() in type Report
    public Object generateReport2() { //FIX
    	return "XLSX";
    }
}
 
public class Test25 {
    public static void main(String[] args) {
        Report rep = new Report();
        String csv = rep.generateReport();
        //Object xlsx = rep.generateReport(); //FIX
        Object xlsx = rep.generateReport2(); //FIX
        System.out.println(csv + ":" + (String)xlsx);
    }
}
