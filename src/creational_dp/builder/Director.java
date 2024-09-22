package creational_dp.builder;
public class Director {
    private DietBuilder builder;

    public Director(DietBuilder builder) {
        this.builder = builder;
    }

    public Director changeBuilder(DietBuilder newBuilder) {
        this.builder = newBuilder;
        return this;
    }

    public void createMeal() {
        Diet diet = builder.reset();
        String type = "";
        if (builder instanceof MediterraneanDietBuilder) {
            type = "Chế độ ăn địa trung hải";
            builder.addProtein("Thịt cá");
            builder.addCarbohydrate("Dầu ô liu");
            builder.addVegetable("Rau quả tươi");
            builder.addDrink("Rượu vang đỏ");
            builder.build();
        } else if (builder instanceof DASHDietBuilder) {
            type = "Chế độ ăn DASH";
            builder.addProtein("Thịt gà");
            builder.addCarbohydrate("Gạo lứt");
            builder.addVegetable("Rau xanh");
            builder.addDrink("Nước ép trái cây");
            builder.build();
        } else if (builder instanceof VegetarianDietBuilder) {
            type = "Chế độ ăn chay";
            builder.addProtein("Đậu hũ");
            builder.addCarbohydrate("Khoai tây");
            builder.addVegetable("Rau củ hỗn hợp");
            builder.addDrink("Nước lọc");
            builder.build();
        }
        System.out.println(type + ": ");
        System.out.println("Protein: " + diet.getProtein());
        System.out.println("Carbohydrate: " + diet.getCarbohydrate());
        System.out.println("Vegetable: " + diet.getVegetable());
        System.out.println("Drink: " + diet.getDrink());
    }

}
