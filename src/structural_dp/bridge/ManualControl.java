package structural_dp.bridge;

public class ManualControl extends ControlSystem {
    public ManualControl(IIrrigationSystem irrigationSystem) {
        super(irrigationSystem);
    }

    @Override
    void control() {
        System.out.println("Manual Control");
        irrigationSystem.waterPlants();
    }
}
