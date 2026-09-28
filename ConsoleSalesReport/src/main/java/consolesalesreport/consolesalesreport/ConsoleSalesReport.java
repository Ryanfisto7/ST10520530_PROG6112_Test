/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package consolesalesreport.consolesalesreport;
/**
 *
 * @author ST10520530
 */
public class ConsoleSalesReport {
    static String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
    static String[] consoles = {"PS5", "XBOX", "SWITCH"};
    
    static int[][] sales = {
        {1000, 2000, 3000},
        {2000, 3000, 4000},
        {1500, 1100, 1200}
    };

    public static void main(String[] args) {
        int[] totals = calculateSales();
        String topCity = getTopSales(totals);
        printReport(totals, topCity);
    }

    public static int[] calculateSales() {
        int[] totals = new int[cities.length];
        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            totals[i] = total;
        }
        
        return totals;
    }

    public static String getTopSales(int[] totals) {
        int max = totals[0];
        int maxIndex = 0;
        
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > max) {
                max = totals[i];
                maxIndex = i;
            }
        }
        
        return cities[maxIndex];
    }

    public static void printReport(int[] totals, String topCity) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------------");
        
        System.out.print("                  "); 
        for (String console : consoles) {
            System.out.print(console + "\t\t");
        }
        System.out.println();

        for (int i = 0; i < sales.length; i++) {
            System.out.print(cities[i]);
            if (cities[i].length() < 12) {
                System.out.print("\t\t");
            } else {
                System.out.print("\t");
            }

            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t\t" + totals[i]);
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("------------------------------------------------------------------");
    }
}