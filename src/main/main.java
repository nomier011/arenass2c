package main;
import bankApp.bank;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankApp bc = new bankApp();

                final int maxAtt = 3;
                int att = 0;
                boolean success = false;

                while (att < maxAtt) {
                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.print("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        success = true;
                        break;
                    } else {
                        att++;
                        System.out.println("INVALID ACCOUNT OR PIN! Attempt " + att + " of " + maxAtt);
                    }
                }

                if (!success) {
                    System.out.println("You have exceeded the maximum number of attempts. Exiting...");
                    System.exit(0); 
                }

                break;

            case 2:
               
                break;

            case 3:
               
                break;

            default:
                System.out.println("Invalid Selection!");
        }
    }
}
