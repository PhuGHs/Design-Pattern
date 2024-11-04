package behavioral_dp.iterator;

public class CarIterator implements VehicleIterator {
    private CarCollection carCollection;
    private int currentIndex;

    public CarIterator(CarCollection carCollection) {
        this.carCollection = carCollection;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < carCollection.getCars().size();
    }

    @Override
    public Vehicle next() {
        if (hasNext()) {
            return carCollection.getCars().get(currentIndex++);
        }
        return null;
    }
}
