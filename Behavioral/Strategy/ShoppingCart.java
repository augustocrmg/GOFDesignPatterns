package Behavioral.Strategy;

public class ShoppingCart {
    private PaymentStategy paymentStategy;

    public void setPaymentStrategy(PaymentStategy paymentStategy){
        this.paymentStategy = paymentStategy;
    }

    public void checkout(int amount){
        paymentStategy.pay(amount);
    }
}
