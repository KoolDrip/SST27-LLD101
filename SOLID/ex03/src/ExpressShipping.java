public class ExpressShipping implements ShippingCostStrategy {
    @Override
    public double calculate(Shipment shipment) {
        return 80 + 8 * shipment.getWeightKg();
    }
}
