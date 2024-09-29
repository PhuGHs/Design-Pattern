package creational_dp.factory_method;

public class BurgerCreator extends FoodCreator {
    @Override
    public Food createFood() {
        return new Burger();
    }
}
