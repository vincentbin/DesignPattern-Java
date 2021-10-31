import interfaces.Pizza;
import interfaces.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheese = nyPizzaStore.orderPizza("cheese");
        System.out.println("cheese = " + cheese.getName());
        System.out.println("cheese = " + cheese);
    }

}
