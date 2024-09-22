package creational_dp.builder;

public class MediterraneanDietBuilder implements DietBuilder {
    private Diet diet;

    @Override
    public void addProtein(String protein) {
        diet.setProtein(protein);
    }

    @Override
    public void addVegetable(String vegetable) {
        diet.setVegetable(vegetable);
    }

    @Override
    public void addDrink(String drink) {
        diet.setDrink(drink);
    }

    @Override
    public void addCarbohydrate(String carbohydrate) {
        diet.setCarbohydrate(carbohydrate);
    }

    @Override
    public Diet reset() {
        diet = new Diet();
        return diet;
    }

    @Override
    public Diet build() {
        return diet;
    }
}
