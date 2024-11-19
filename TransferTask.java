package org.javatrain.is;

import java.util.ArrayList;
import java.util.List;

public class TransferTask implements Runnable{
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;

    public TransferTask(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        fromAccount.transfer(toAccount, amount);
    }
}
