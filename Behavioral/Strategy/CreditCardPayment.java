package Behavioral.Strategy;

public class CreditCardPayment implements PaymentStategy{
    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name){
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount){
        System.out.println("Payment of $"+amount+" realized with credit card "+cardNumber+" by (Holder "+name+" )");
    }
}
