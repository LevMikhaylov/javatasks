package org.javatrain.is;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public synchronized void transfer(BankAccount targetAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Transfer amount must be positive");
            return;
        }
        if (this.balance < amount) {
            System.out.println("Insufficient funds for transfer from " + this.accountNumber);
            return;
        }

        // Simulate a delay for the transfer operation
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Perform the transfer
        this.balance -= amount; // Deduct from source account
        targetAccount.deposit(amount); // Add to target account

        System.out.printf("Transferred %.2f from %s to %s. New balance: %.2f ",
                amount, this.accountNumber, targetAccount.accountNumber, this.balance);
    }

    public synchronized void deposit(double amount) {
        this.balance += amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
