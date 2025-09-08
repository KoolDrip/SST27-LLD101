package beverages_decorator;

public class Sugar extends AddOnDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 2; 
    }
}
