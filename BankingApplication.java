import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nBanking Application Menu:");
            System.out.println("1. Create a new account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update an account");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit an amount into your account");
            System.out.println("6. Withdraw an amount from your account");
            System.out.println("7. Search for account");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter creation date: ");
                    String creationDate = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(name, accNumber, creationDate, initialBalance);
                    break;

                case 2:
                    bank.displayAllAccounts();
                    break;

                case 3:
                    System.out.print("Enter account number to update: ");
                    String accNumToUpdate = scanner.nextLine();
                    System.out.print("Enter new balance: ");
                    double newBalance = scanner.nextDouble();
                    bank.updateAccount(accNumToUpdate, newBalance);
                    break;

                case 4:
                    System.out.print("Enter account number to delete: ");
                    String accNumToDelete = scanner.nextLine();
                    bank.deleteAccount(accNumToDelete);
                    break;

                case 5:
                    System.out.print("Enter account number for deposit: ");
                    String accNumToDeposit = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accNumToDeposit, depositAmount);
                    break;

                case 6:
                    System.out.print("Enter account number for withdrawal: ");
                    String accNumToWithdraw = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    System.out.print("Enter minimum balance: ");
                    double minBalance = scanner.nextDouble();
                    bank.withdraw(accNumToWithdraw, withdrawalAmount, minBalance);
                    break;

                case 7:
                    System.out.print("Enter account number to search: ");
                    String accNumToSearch = scanner.nextLine();
                    bank.searchAccount(accNumToSearch);
                    break;

                case 8:
                    System.out.println("Exiting the application. Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }
}
