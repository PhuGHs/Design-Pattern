package behavioral_dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class BusCollection implements VehicleCollection {
    private List<Vehicle> buses = new ArrayList<>();

    public void addBus(Vehicle vehicle) {
        buses.add(vehicle);
    }

    public List<Vehicle> getBuses() {
        return buses;
    }

    @Override
    public VehicleIterator createIterator() {
        return new BusIterator(this);
    }
}
