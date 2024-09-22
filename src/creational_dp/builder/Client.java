package creational_dp.builder;
public class Client {
    public static void main(String[] args) {
        DietBuilder DASHBuilder = new DASHDietBuilder();
        DietBuilder mediterreneanBuilder = new MediterraneanDietBuilder();
        DietBuilder vegetarianBuilder = new VegetarianDietBuilder();
        Director director = new Director(DASHBuilder);
        director.createMeal();

        Director director1 = director.changeBuilder(mediterreneanBuilder);
        director1.createMeal();

        Director director2 = director.changeBuilder(vegetarianBuilder);
        director2.createMeal();
    }
}
