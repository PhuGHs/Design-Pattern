package structural_dp.bridge;

public abstract class ControlSystem {
    protected IIrrigationSystem irrigationSystem;

    public ControlSystem(IIrrigationSystem irrigationSystem) {
        this.irrigationSystem = irrigationSystem;
    }

    abstract void control();
}
