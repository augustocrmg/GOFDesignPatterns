package Behavioral.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        PaymentStategy paymentCreditCard = new CreditCardPayment("0000", "Augusto D.Camargo");
        PaymentStategy payemntPaypal = new PayPalPayment("myemail@gmail.com");

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(paymentCreditCard);
        cart.checkout(1000);

        cart.setPaymentStrategy(payemntPaypal);
        cart.checkout(33000);
    }
}
