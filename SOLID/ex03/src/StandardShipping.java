public class StandardShipping implements ShippingCostStrategy {
    @Override
    public double calculate(Shipment shipment) {
        return 50 + 5 * shipment.getWeightKg();
    }
}
