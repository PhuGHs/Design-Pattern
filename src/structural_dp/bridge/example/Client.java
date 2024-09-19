package structural_dp.bridge.example;

public class Client {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(IDevice device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.volumeDown();
        basicRemote.channelUp();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
