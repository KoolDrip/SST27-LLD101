package beverages_decorator;

public class Client {

    public static void main(String[] args) {

        // Plain Cappuccino
        Beverage coffee = new Cappuccino();
        System.out.println("Cappuccino: " + coffee.cost());

        // Cappuccino + Milk + Sugar
        Beverage customCoffee = new Sugar(new Milk(new Cappuccino()));
        System.out.println("Cappuccino + Milk + Sugar: " + customCoffee.cost());

        // Latte + Whipped Cream + Sugar
        Beverage latteWithToppings = new Sugar(new WhippedCream(new Latte()));
        System.out.println("Latte + Whipped Cream + Sugar: " + latteWithToppings.cost());

        // Latte + Double Milk
        Beverage latteDoubleMilk = new Milk(new Milk(new Latte()));
        System.out.println("Latte + Double Milk: " + latteDoubleMilk.cost());
    }
}
