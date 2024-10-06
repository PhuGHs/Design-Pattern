package structural_dp.bridge;

public class Client {
    public static void main(String[] args) {
        //initialize irrigation -> implementation
        DripIrrigation drip = new DripIrrigation();
        SprinklerIrrigation sprinkler = new SprinklerIrrigation();
        ManualIrrigation manual = new ManualIrrigation();

        //initialize control system -> abstraction
        AutomaticControl automaticControl = new AutomaticControl(drip);
        ManualControl manualControl = new ManualControl(sprinkler);
        ManualControl atControl = new ManualControl(manual);

        //take actions
        automaticControl.control();
        manualControl.control();
        atControl.control();
    }
}
