public class OrderService {
    private final TaxCalculator taxCalculator;
    private final Notifier notifier;

    public OrderService(TaxCalculator taxCalculator, Notifier notifier) {
        this.taxCalculator = taxCalculator;
        this.notifier = notifier;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculate(subtotal);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}