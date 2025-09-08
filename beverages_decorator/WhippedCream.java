package beverages_decorator;

public class WhippedCream extends AddOnDecorator {

    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 7;
    }
}
