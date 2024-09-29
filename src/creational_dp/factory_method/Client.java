package creational_dp.factory_method;

public class Client {
    public static void main(String[] args) {
        FoodCreator burgerCreator = new BurgerCreator();
        FoodCreator pastaCreator = new PastaCreator();
        FoodCreator pizzaCreator = new PizzaCreator();

        Food b = burgerCreator.createFood();
        Food c = pastaCreator.createFood();
        Food d = pizzaCreator.createFood();

        b.prepare();
        b.cook();
        b.serve();

        c.prepare();
        c.cook();
        c.serve();
    }
}
