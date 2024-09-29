package creational_dp.factory_method;

public class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Pizza");
    }

    @Override
    public void serve() {
        System.out.println("Serving Pizza");
    }
}
