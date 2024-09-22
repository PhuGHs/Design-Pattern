package creational_dp.builder;

public interface DietBuilder {
    void addProtein(String protein);
    void addVegetable(String vegetable);
    void addDrink(String drink);
    void addCarbohydrate(String carbohydrate);
    Diet reset();
    Diet build();
}
