public class FixedTaxCalculator implements TaxCalculator {
    private final double taxRate;

    public FixedTaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double calculate(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
