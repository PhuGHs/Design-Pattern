package behavioral_dp.iterator;

public class BusIterator implements VehicleIterator {
    private BusCollection busCollection;
    private int currentIndex;

    public BusIterator(BusCollection busCollection) {
        this.busCollection = busCollection;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < busCollection.getBuses().size();
    }

    @Override
    public Vehicle next() {
        if (hasNext()) {
            return busCollection.getBuses().get(currentIndex++);
        }
        return null;
    }
}
