import java.util.*;

public class ATMInterface {
    static Scanner sc = new Scanner(System.in);
    static int balance = 1000;
    static List<String> history = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (pin == 1234) {
            int choice;
            do {
                System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. View History\n5. Exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1: System.out.println("Balance: Rs. " + balance); break;
                    case 2: deposit(); break;
                    case 3: withdraw(); break;
                    case 4: viewHistory(); break;
                    case 5: System.out.println("Thank you!"); break;
                    default: System.out.println("Invalid choice.");
                }
            } while (choice != 5);
        } else {
            System.out.println("Invalid PIN.");
        }
    }

    public static void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amt = sc.nextInt();
        balance += amt;
        history.add("Deposited: Rs. " + amt);
    }

    public static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amt = sc.nextInt();
        if (amt <= balance) {
            balance -= amt;
            history.add("Withdrawn: Rs. " + amt);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static void viewHistory() {
        System.out.println("Transaction History:");
        for (String entry : history)
            System.out.println(entry);
    }
}
