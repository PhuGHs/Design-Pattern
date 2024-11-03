package behavioral_dp.chain_of_responsibilities.example;

public class L3Support extends BaseHandler {
    public L3Support(Severity severity) {
        super(severity);
    }

    @Override
    public void handleRequest(Ticket t) {
        if (canHandle(t.getSeverity())) {
            System.out.println("L3 supported ticket");
        } else {
            System.out.println("L3 escalates ticket");
            super.handleRequest(t);
        }
    }
}
