import interfaces.Pizza;
import interfaces.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        }
        // still other kinds of pizzas omitting them
        return null;
    }

}
