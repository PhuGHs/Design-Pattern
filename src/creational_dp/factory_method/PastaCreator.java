package creational_dp.factory_method;

public class PastaCreator extends FoodCreator {
    @Override
    public Food createFood() {
        return new Pasta();
    }
}
