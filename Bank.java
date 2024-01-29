import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void createAccount(String name, String number, String creationDate, double balance) {
        Account account = new Account(name, number, creationDate, balance);
        accounts.add(account);
        System.out.println("Account created successfully!");
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }

    public void updateAccount(String number, double balance) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                account.setBalance(balance);
                System.out.println("Account updated successfully!");
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public void deleteAccount(String number) {
        accounts.removeIf(account -> account.getNumber().equals(number));
        System.out.println("Account deleted successfully!");
    }

    public void deposit(String number, double amount) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                account.setBalance(account.getBalance() + amount);
                System.out.println("Amount deposited successfully!");
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public void withdraw(String number, double amount, double minBalance) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                if (account.getBalance() - amount >= minBalance) {
                    account.setBalance(account.getBalance() - amount);
                    System.out.println("Amount withdrawn successfully!");
                } else {
                    System.out.println("Insufficient funds for withdrawal!");
                }
                return;
            }
        }
        System.out.println("Account not found!");
    }

    public void searchAccount(String number) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                System.out.println(account);
                return;
            }
        }
        System.out.println("Account not found!");
    }
}
