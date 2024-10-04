package ru.ithub.javatrain;
class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Пополнено на %.2f. Текущий баланс: %.2f ", amount, balance);
        } else {
            System.out.println("Сумма пополнения должна быть положительной!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Снято %.2f. Текущий баланс: %.2f ", amount, balance);
        } else if (amount > balance) {
            System.out.println("Недостаточно средств на счете!");
        } else {
            System.out.println("Сумма снятия должна быть положительной!");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
public class Main {
    public static void main(String[]args) {
        BankAccount account = new BankAccount("123456789");
        account.deposit(1000); // Пополнение счета на 1000
        account.withdraw(500);  // Снятие 500
        account.withdraw(600);  // Попытка снять больше, чем на счете
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}
