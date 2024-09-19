package creational_dp.abstract_factory;

public class EuropeanCarFactory implements CarFactory {
    @Override
    public Car createSudanCar() {
        return new SedanCar(new EuropeanSize(), new EuropeanEngine(), new EuropeanSeat());
    }

    @Override
    public Car createElectricCar() {
        return new ElectricCar(new EuropeanSize(), new EuropeanEngine(), new EuropeanSeat());
    }

    @Override
    public Car createSUVCar() {
        return new SUVCar(new EuropeanSize(), new EuropeanEngine(), new EuropeanSeat());
    }
}
