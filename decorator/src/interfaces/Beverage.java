package interfaces;

public abstract class Beverage {

    public String description = "unknown beverage.";

    public String getDescription() {
        return this.description;
    }

    /**
     * 获取饮料价格
     * @return
     */
    public abstract double getCost();
}
