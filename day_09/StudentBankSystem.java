import java.util.Scanner;

public class StudentBankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Account details
        String studentName;
        String studentId;
        String accountNumber;
        double balance;

        // Account Creation
        System.out.println("===== STUDENT BANK SYSTEM =====");

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Student ID: ");
        studentId = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter Initial Deposit Amount: ");
        balance = sc.nextDouble();

        while (balance <= 0) {
            System.out.println("Initial deposit must be greater than ₹0.");
            System.out.print("Enter Initial Deposit Amount again: ");
            balance = sc.nextDouble();
        }

        System.out.println("\nAccount created successfully!");

        // Main Menu
        int choice;

        do {
            System.out.println("\n===== STUDENT BANK SYSTEM =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Deposit Money
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Amount deposited successfully.");
                        System.out.println("Updated Balance: ₹" + balance);
                    } else {
                        System.out.println("Amount must be greater than ₹0.");
                    }
                    break;

                case 2:
                    // Withdraw Money
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Amount must be greater than ₹0.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Amount withdrawn successfully.");
                        System.out.println("Remaining Balance: ₹" + balance);
                    }
                    break;

                case 3:
                    // Check Balance
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    // Display Account Details
                    System.out.println("\n===== ACCOUNT DETAILS =====");
                    System.out.println("Student Name  : " + studentName);
                    System.out.println("Student ID    : " + studentId);
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("Balance       : ₹" + balance);
                    break;

                case 5:
                    // Calculate Interest
                    System.out.print("Enter number of years: ");
                    int years = sc.nextInt();

                    double rate = 5.0;
                    double interest = (balance * rate * years) / 100;
                    double newBalance = balance + interest;

                    System.out.println("Interest Earned: ₹" + interest);
                    System.out.println("New Balance: ₹" + newBalance);
                    break;

                case 6:
                    // Exit
                    System.out.println("Thank you for using Student Bank System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}