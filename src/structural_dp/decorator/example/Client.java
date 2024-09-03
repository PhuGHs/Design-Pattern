package structural_dp.decorator.example;

public class Client {
    private Notifier notifier;
    public Client() {
        notifier = new BasicNotifier();
    }
    public void sendMessage(String message) {
        notifier = new EmailNotifier(notifier);
        notifier = new FacebookNotifier(notifier);
        notifier = new SMSNotifier(notifier);

        notifier.send(message);
    }
}
