public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator taxCalc = new FixedTaxCalculator(0.18);
        Notifier email = new EmailClient();

        OrderService service = new OrderService(taxCalc, email);
        service.checkout("a@shop.com", 100.0);
    }
}
