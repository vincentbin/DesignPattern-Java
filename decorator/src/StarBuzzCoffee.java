import interfaces.Beverage;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Soy(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());
    }
}
