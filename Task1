import java.util.*;

public class ReservationSystem {
    static Scanner sc = new Scanner(System.in);
    static String username = "admin", password = "1234";
    static String reservedPNR = "";

    public static void main(String[] args) {
        System.out.print("Enter Username: ");
        String user = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login successful!");
            showMenu();
        } else {
            System.out.println("Login failed.");
        }
    }

    public static void showMenu() {
        while (true) {
            System.out.println("\n1. Reserve Ticket\n2. Cancel Ticket\n3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: reserve(); break;
                case 2: cancel(); break;
                case 3: System.exit(0);
                default: System.out.println("Invalid option.");
            }
        }
    }

    public static void reserve() {
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter From: ");
        String from = sc.nextLine();
        System.out.print("Enter To: ");
        String to = sc.nextLine();
        System.out.print("Enter Date of Travel: ");
        String date = sc.nextLine();
        reservedPNR = "PNR" + new Random().nextInt(9999);
        System.out.println("Reservation successful. PNR: " + reservedPNR);
    }

    public static void cancel() {
        sc.nextLine();
        System.out.print("Enter your PNR to cancel: ");
        String pnr = sc.nextLine();
        if (pnr.equals(reservedPNR)) {
            System.out.println("Cancellation successful.");
            reservedPNR = "";
        } else {
            System.out.println("PNR not found.");
        }
    }
}
