package creational_dp.abstract_factory;

public class SedanCar extends Car {

    public SedanCar(Size size, Engine engine, Seat seat) {
        super(size, engine, seat);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture SedanCar");
    }

    @Override
    public void release() {
        System.out.println("Release SedanCar");
        System.out.println("Engine: " + engine.getEngine());
        System.out.println("Seat: " + seat.getSeat());
        System.out.println("Size: " + size.getSize());
    }
}
