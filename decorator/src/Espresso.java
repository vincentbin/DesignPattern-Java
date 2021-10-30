import interfaces.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
