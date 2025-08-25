public interface PaymentProcessor {
    String pay(Payment payment);
    String getProvider();
}
