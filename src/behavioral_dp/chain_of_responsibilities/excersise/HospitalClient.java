package behavioral_dp.chain_of_responsibilities.excersise;

public class HospitalClient {
    public static void main(String[] args) {
        Patient patient = new Patient(1L, "Le Van Phu", "Cough");
        Request request = new Request(patient, "Feel exhausted");

        Handler receptionHandler = new ReceptionHandler();
        Handler diagnosisHandler = new DiagnosisHandler();
        Handler treatmentHandler = new TreatmentHandler();
        Handler consultationHandler = new ConsultationHandler();

        receptionHandler.setNextHandler(diagnosisHandler);
        diagnosisHandler.setNextHandler(treatmentHandler);
        treatmentHandler.setNextHandler(consultationHandler);

        receptionHandler.handleRequest(request);
    }
}
