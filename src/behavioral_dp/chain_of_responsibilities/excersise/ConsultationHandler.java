package behavioral_dp.chain_of_responsibilities.excersise;

public class ConsultationHandler extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<Consultation Handler>>>>>>>>>>>>>>>>>>>>>>>>\n");
        System.out.println("Consulter advises patient on how to get well");
    }
}
