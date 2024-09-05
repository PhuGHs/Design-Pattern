package structural_dp.bridge.example;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(IDevice device) {
        super(device);
    }

    public void mute() {
        System.out.println("AdvancedRemote: mute");
        device.setVolume(0);
    }
}
