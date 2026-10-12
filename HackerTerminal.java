import java.util.Scanner;
import java.util.Random;

public class HackerTerminal {

    static Scanner scanner = new Scanner(System.in);
    static boolean authenticated = false;

    static final String USERNAME = "admin";
    static final String PASSWORD = "1234";

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== NEXUS TERMINAL =====");
            System.out.println("1. Login System");
            System.out.println("2. System Information");
            System.out.println("3. Access Code Generator");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    login();
                    break;

                case 2:
                    systemInformation();
                    break;

                case 3:
                    generateAccessCode();
                    break;

                case 4:
                    System.out.println("Goodbye! NEXUS Terminal shutting down...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    static void login() {

        int attempts = 0;

        while (attempts < 3 && !authenticated) {

            System.out.print("Enter username: ");
            String username = scanner.next();

            System.out.print("Enter password: ");
            String password = scanner.next();

            if (username.equals(USERNAME) &&
                password.equals(PASSWORD)) {

                authenticated = true;
                System.out.println("Login successful! Welcome to NEXUS.");

            } else {
                attempts++;
                System.out.println("Invalid credentials! Attempts left: "
                        + (3 - attempts));
            }
        }

        if (!authenticated) {
            System.out.println("Maximum login attempts reached!");
        }
    }

    static void systemInformation() {

        System.out.println("\n===== SYSTEM INFORMATION =====");
        System.out.println("System Name       : NEXUS Terminal");
        System.out.println("Version           : 1.0");
        System.out.println("Programming Lang. : Java");
        System.out.println("Operating Status  : Online");
    }

    static void generateAccessCode() {

        if (!authenticated) {
            System.out.println("Access denied! Please log in first.");
            return;
        }

        Random random = new Random();
        int accessCode = 100000 + random.nextInt(900000);

        System.out.println("Your access code is: " + accessCode);
    }
}