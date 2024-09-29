package bankSystem;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    // Method to create a new account
    public void createAccount(String accountHolderName, String accountNumber, double initialDeposit) {
        BankAccount newAccount = new BankAccount(accountHolderName, accountNumber, initialDeposit);
        accounts.add(newAccount);
        System.out.println("Account created successfully.");
    }

    // Method to find an account using the account number
    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Method to deposit money into an account
    public void depositToAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw money from an account
    public void withdrawFromAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to display account information
    public void displayAccountInfo(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.displayAccountInfo();
        } else {
            System.out.println("Account not found.");
        }
    }
}
