package org.example;

public class Card {
    private double account;
    public Card(double account) {
        this.account = account;
    }
    public void pay(double amount) throws LessMoneyException{
        if(amount < account){
            throw new LessMoneyException("На карте не хватает средств");
        }
        else{
            account -= amount;
        }
    }

}
