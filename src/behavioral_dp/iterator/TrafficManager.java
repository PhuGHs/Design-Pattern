package behavioral_dp.iterator;

public class TrafficManager {
    public static void main(String[] args) {
        BusCollection busCollection = new BusCollection();
        CarCollection carCollection = new CarCollection();
        TruckCollection truckCollection = new TruckCollection();

        Vehicle bus1 = new Vehicle(1L, "Bus", "59X-12345", 5000, "Bus Manufacturer");
        Vehicle bus2 = new Vehicle(2L, "Bus", "59X-12222", 5000, "Bus Manufacturer");
        Vehicle bus3 = new Vehicle(3L, "Bus", "59X-13333", 5000, "Bus Manufacturer");
        busCollection.addBus(bus1);
        busCollection.addBus(bus2);
        busCollection.addBus(bus3);

        Vehicle car1 = new Vehicle(4L, "Car", "59X-0000", 1000, "Car Manufacturer");
        Vehicle car2 = new Vehicle(5L, "Car", "59X-1111", 1000, "Car Manufacturer");
        Vehicle car3 = new Vehicle(6L, "Car", "59X-2222", 1000, "Car Manufacturer");
        carCollection.addCar(car1);
        carCollection.addCar(car2);
        carCollection.addCar(car3);

        Vehicle truck3 = new Vehicle(7L, "Truck", "59X-5555", 2000, "Truck Manufacturer");
        Vehicle truck1 = new Vehicle(8L, "Truck", "59X-3333", 12000, "Truck Manufacturer");
        Vehicle truck2 = new Vehicle(9L, "Truck", "59X-4444", 8000, "Truck Manufacturer");
        truckCollection.addVehicle(truck3);
        truckCollection.addVehicle(truck1);
        truckCollection.addVehicle(truck2);

        displayVehicles(carCollection.createIterator());
        displayVehicles(truckCollection.createIterator());
        displayVehicles(busCollection.createIterator());
    }

    private static void displayVehicles(VehicleIterator iterator) {
        while (iterator.hasNext()) {
            Vehicle vehicle = iterator.next();
            System.out.println("Vehicle ID: " + vehicle.getVehicleId());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("License Plate: " + vehicle.getLicensePlate());
            System.out.println("Capacity: " + vehicle.getCapacity());
            System.out.println("Manufacturer: " + vehicle.getManufacturer());
            System.out.println();
        }
    }
}
