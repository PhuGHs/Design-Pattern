package behavioral_dp.chain_of_responsibilities.example;

public class L2Support extends BaseHandler {
    public L2Support(Severity severity) {
        super(severity);
    }

    @Override
    public void handleRequest(Ticket t) {
        if (canHandle(t.getSeverity())) {
            System.out.println("L2 supported ticket");
        } else {
            System.out.println("L2 escalates ticket");
            super.handleRequest(t);
        }
    }
}
