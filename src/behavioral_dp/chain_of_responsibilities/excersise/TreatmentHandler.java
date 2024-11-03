package behavioral_dp.chain_of_responsibilities.excersise;

public class TreatmentHandler extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<Treatment handler>>>>>>>>>>>>>>>>>>>>>\n");

        System.out.println("----------Prescribe medicine----------------");
        System.out.println("Medicine: A, B");

        super.handleRequest(request);
    }
}
