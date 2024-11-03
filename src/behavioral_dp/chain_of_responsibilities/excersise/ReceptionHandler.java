package behavioral_dp.chain_of_responsibilities.excersise;

public class ReceptionHandler extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Reception handler>>>>>>>>>>>>>>>>>>>>>>>>\n");

        Patient patient = request.getPatient();
        patient.printInfo();

        //send to next handler
        super.handleRequest(request);
    }
}
