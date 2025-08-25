public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public String pay(Payment payment) {
        return "Charged card: " + payment.amount;
    }
    @Override
    public String getProvider() {
        return "CARD";
    }
}