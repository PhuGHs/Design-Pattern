package creational_dp.abstract_factory;

public class AsianCarFactory implements CarFactory {
    @Override
    public Car createSudanCar() {
        return new SedanCar(new AsianSize(), new AsianEngine(), new AsianSeat());
    }

    @Override
    public Car createElectricCar() {
        return new ElectricCar(new AsianSize(), new AsianEngine(), new AsianSeat());
    }

    @Override
    public Car createSUVCar() {
        return new SUVCar(new AsianSize(), new AsianEngine(), new AsianSeat());
    }
}
