package behavioral_dp.chain_of_responsibilities.excersise;

import java.util.Objects;

public abstract class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNextHandler(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if (Objects.isNull(next)) {
            System.out.println("End of chain");
        } else {
            next.handleRequest(request);
        }
    }
}
