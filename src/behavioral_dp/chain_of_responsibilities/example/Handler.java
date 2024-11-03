package behavioral_dp.chain_of_responsibilities.example;

public interface Handler {
    void setNext(Handler h);
    void handleRequest(Ticket t);
}
