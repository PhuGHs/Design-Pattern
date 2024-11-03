package behavioral_dp.chain_of_responsibilities.example;

public class L1Support extends BaseHandler {
    public L1Support(Severity severity) {
        super(severity);
    }

    @Override
    public void handleRequest(Ticket t) {
        if (canHandle(t.getSeverity())) {
            System.out.println("L1 supported ticket");
        } else {
            System.out.println("L1 escalates ticket");
            super.handleRequest(t);
        }
    }
}
