/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package consolesalesreport.consolesalesapp;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("-------------------");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}