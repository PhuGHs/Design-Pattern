package behavioral_dp.chain_of_responsibilities.example;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new L1Support(Severity.LOW);
        Handler h2 = new L2Support(Severity.MEDIUM);
        Handler h3 = new L3Support(Severity.HIGH);

        h1.setNext(h2);
//        h2.setNext(h3);

        Ticket ticket1 = new Ticket(Severity.LOW, "Simple issue");
        Ticket ticket2 = new Ticket(Severity.MEDIUM, "Moderate issue");
        Ticket ticket3 = new Ticket(Severity.HIGH, "Complex issue");

//        h1.handleRequest(ticket1);
        h1.handleRequest(ticket3);
//        h1.handleRequest(ticket3);
    }
}
