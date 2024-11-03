package behavioral_dp.chain_of_responsibilities.example;

public class BaseHandler implements Handler {
    private Handler next;
    private Severity severity;

    public BaseHandler(Severity severity) {
        this.severity = severity;
    }

    @Override
    public void setNext(Handler h) {
        this.next = h;
    }

    @Override
    public void handleRequest(Ticket t) {
        if (next == null) {
            System.out.println("Ticket not resolved: " + t.getDescription());
        } else {
            next.handleRequest(t);
        }
    }

    protected boolean canHandle(Severity complexityLevel) {
        return severity.getLevel() >= complexityLevel.getLevel();
    }
}
