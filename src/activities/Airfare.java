package activities;

import java.util.Scanner;

public class Airfare {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Distance (km): ");
        double distance = scanner.nextDouble();
        
        System.out.println("Select class:");
        System.out.println("1: Economy Class");
        System.out.println("2: Business Class");
        System.out.print("Class: ");
        int travelClass = scanner.nextInt();
        
        double baseFarePerKm = 0;
        
        if (travelClass == 1) {
            baseFarePerKm = 250;
        } else if (travelClass == 2) {
            baseFarePerKm = 500;
        } else {
            System.out.println("Invalid class");
            return;
            
        }
        
        double totalFare;
        totalFare = distance * baseFarePerKm;
        
        if (distance > 1000) {
            totalFare = totalFare * 0.9;
        }
        
        System.out.printf("Total fare: %.2f\n",+ totalFare);
        
        scanner.close();
            
    } 
}
