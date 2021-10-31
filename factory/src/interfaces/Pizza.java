package interfaces;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Add toppings:");
        for (String topping : toppings) {
            System.out.println("topping = " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking");
    }

    public void cut() {
        System.out.println("Cutting");
    }

    public void box() {
        System.out.println("Boxing");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }

}
