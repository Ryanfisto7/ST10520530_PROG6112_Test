package consolesalesreport.consolesalesapp;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */

public class RunApplication {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
  
            System.out.println("Select the Console type");
            System.out.println("1) PS5");
            System.out.println("2) XBOX");
            System.out.println("3) SWITCH");
            int option = sc.nextInt();
            sc.nextLine();
            
            String type = "";
            switch (option) {
                case 1 -> type = "PS5";
                case 2 -> type = "XBOX";
                case 3 -> type = "SWITCH";
                default -> {
                }
            }
            
            System.out.print("Enter the store Name : ");
            String store = sc.nextLine();
           System.out.print("Enter the total sales of " + type + " consoles for " + store + ": ");
            int sales = sc.nextInt();
           ConsoleSales report = new ConsoleSales(type, store, sales);
            report.printReport();
        }
    }
}
