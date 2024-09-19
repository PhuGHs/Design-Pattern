package creational_dp.abstract_factory;

public class SUVCar extends Car {
    public SUVCar(Size size, Engine engine, Seat seat) {
        super(size, engine, seat);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture SUV Car");
    }

    @Override
    public void release() {
        System.out.println("Release SUV Car");
        System.out.println("Engine: " + engine.getEngine());
        System.out.println("Size: " + size.getSize());
        System.out.println("Seat: " + seat.getSeat());
    }
}
