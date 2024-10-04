// Интерфейс PaymentSystem
interface PaymentSystem {
    void pay(double amount);
    void refund(double amount);
}
class CreditCard implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата с использованием кредитной карты на сумму: $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат средств на кредитную карту на сумму: $" + amount);
    }
}
public class PayPal implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата с использованием PayPal на сумму: $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат средств на PayPal на сумму: $" + amount);
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentSystem creditCard = new CreditCard();
        creditCard.pay(100.00);
        creditCard.refund(50.00);

        PaymentSystem payPal = new PayPal();
        payPal.pay(75.00);
        payPal.refund(30.00);
    }
}
