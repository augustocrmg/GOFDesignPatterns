package Behavioral.Strategy;

public class PayPalPayment implements PaymentStategy {
    private String email;

    public PayPalPayment(String email){
        this.email = email;
    }

    @Override
    public void pay(int amount){
        System.out.println("Payment of $"+amount+" realized by the following email: "+email);
    }
}
