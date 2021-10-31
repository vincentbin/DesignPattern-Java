package interfaces;

/**
 * factory class
 */
public abstract class PizzaStore {

    /**
     * 下订单
     * @param type 类型
     * @return pizza 实体
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
