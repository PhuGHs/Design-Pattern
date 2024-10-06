package structural_dp.bridge;

public class AutomaticControl extends ControlSystem {
    public AutomaticControl(IIrrigationSystem irrigationSystem) {
        super(irrigationSystem);
    }

    @Override
    void control() {
        System.out.println("Automatic Control");
        irrigationSystem.waterPlants();
    }
}
