package creational_dp.abstract_factory;

public class Client {
    public static void main(String[] args) {
        CarFactory factory = new EuropeanCarFactory();
        Car sedanCar = factory.createSudanCar();
        sedanCar.manufacture();
        sedanCar.release();

        CarFactory asianFactory = new AsianCarFactory();
        Car electricCar = factory.createElectricCar();
        electricCar.manufacture();
        electricCar.release();
    }
}
