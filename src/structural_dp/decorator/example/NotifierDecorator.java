package structural_dp.decorator.example;

//Base decorator
public class NotifierDecorator implements Notifier {
    protected Notifier wrapped; //wrapped object

    public NotifierDecorator(Notifier notifier) {
        this.wrapped = notifier;
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }
}
