import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        PaymentService service = new PaymentService(Arrays.asList(
            new CardPaymentProcessor(),
            new UpiPaymentProcessor(),
            new WalletPaymentProcessor()
        ));

        System.out.println(service.pay(new Payment("UPI", 499)));
    }
}
