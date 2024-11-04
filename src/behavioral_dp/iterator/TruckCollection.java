package behavioral_dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class TruckCollection implements VehicleCollection {
    private List<Vehicle> trucks = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        trucks.add(vehicle);
    }

    public List<Vehicle> getTrucks() {
        return trucks;
    }

    @Override
    public VehicleIterator createIterator() {
        return new TruckIterator(this, 10000); //just traverse truck has capacity over 10000
    }
}
