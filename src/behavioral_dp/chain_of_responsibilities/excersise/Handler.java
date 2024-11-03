package behavioral_dp.chain_of_responsibilities.excersise;

public interface Handler {
    void setNextHandler(Handler handler);
    void handleRequest(Request request);
}
