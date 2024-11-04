package behavioral_dp.iterator;

public class TruckIterator implements VehicleIterator {
    private TruckCollection truckCollection;
    private int currentIndex;
    private int minCapacity;

    public TruckIterator(TruckCollection truckCollection, int minCapacity) {
        this.truckCollection = truckCollection;
        this.minCapacity = minCapacity;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < truckCollection.getTrucks().size()) {
            if (truckCollection.getTrucks().get(currentIndex).getCapacity() >= minCapacity) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Vehicle next() {
        if (hasNext()) {
            return truckCollection.getTrucks().get(currentIndex++);
        }
        return null;
    }
}
