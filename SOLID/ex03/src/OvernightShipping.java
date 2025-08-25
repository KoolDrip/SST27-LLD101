public class OvernightShipping implements ShippingCostStrategy {
    @Override
    public double calculate(Shipment shipment) {
        return 120 + 10 * shipment.getWeightKg();
    }
}
