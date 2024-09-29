package creational_dp.factory_method;

public class Pasta implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Pasta");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Pasta");
    }

    @Override
    public void serve() {
        System.out.println("Serving Pasta");
    }
}
