import java.util.*;

public class PaymentService {
    private final Map<String, PaymentProcessor> processors = new HashMap<>();

    public PaymentService(List<PaymentProcessor> processorsList) {
        for (PaymentProcessor processor : processorsList) {
            processors.put(processor.getProvider(), processor);
        }
    }

    public String pay(Payment p) {
        PaymentProcessor processor = processors.get(p.provider);
        if (processor == null) {
            throw new RuntimeException("No provider: " + p.provider);
        }
        return processor.pay(p);
    }
}
