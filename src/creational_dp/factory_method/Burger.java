package creational_dp.factory_method;

public class Burger implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Burger");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Burger");
    }

    @Override
    public void serve() {
        System.out.println("Serving Burger");
    }
}
