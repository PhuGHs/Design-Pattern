package behavioral_dp.chain_of_responsibilities.excersise;

import java.util.Scanner;

public class DiagnosisHandler extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<Diagnosis Handler>>>>>>>>>>>>>>>\n");
        request.displayPatient();

        super.handleRequest(request);
    }
}
