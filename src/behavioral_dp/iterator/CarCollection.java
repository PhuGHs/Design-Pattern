package behavioral_dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class CarCollection implements VehicleCollection {
    private List<Vehicle> cars = new ArrayList<>();

    public void addCar(Vehicle car) {
        cars.add(car);
    }

    public List<Vehicle> getCars() {
        return cars;
    }

    @Override
    public VehicleIterator createIterator() {
        return new CarIterator(this);
    }
}
