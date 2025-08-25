public class Demo03 {
    public static void main(String[] args) {
        Shipment s1 = new Shipment(2.0);
        Shipment s2 = new Shipment(3.5);
        Shipment s3 = new Shipment(1.0);

        ShippingCostCalculator calc1 = new ShippingCostCalculator(new StandardShipping());
        ShippingCostCalculator calc2 = new ShippingCostCalculator(new ExpressShipping());
        ShippingCostCalculator calc3 = new ShippingCostCalculator(new OvernightShipping());

        System.out.println("Standard(2.0kg): " + calc1.cost(s1));
        System.out.println("Express(3.5kg): " + calc2.cost(s2));
        System.out.println("Overnight(1.0kg): " + calc3.cost(s3));
    }
}
