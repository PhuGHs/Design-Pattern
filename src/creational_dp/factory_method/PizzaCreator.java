package creational_dp.factory_method;

public class PizzaCreator extends FoodCreator {
    @Override
    public Food createFood() {
        return new Pizza();
    }
}
