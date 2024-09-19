package creational_dp.abstract_factory;

public abstract class Car {
    protected Size size;
    protected Engine engine;
    protected Seat seat;

    public Car(Size size, Engine engine, Seat seat) {
        this.size = size;
        this.engine = engine;
        this.seat = seat;
    }

    public abstract void manufacture();
    public abstract void release();
}
