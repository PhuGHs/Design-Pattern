package creational_dp.abstract_factory;

public class ElectricCar extends Car {
    public ElectricCar(Size size, Engine engine, Seat seat) {
        super(size, engine, seat);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture Electric Car");
    }

    @Override
    public void release() {
        System.out.println("Release Electric Car");
        System.out.println("Engine: " + engine.getEngine());
        System.out.println("Seat: " + seat.getSeat());
        System.out.println("Size: " + size.getSize());
    }
}
