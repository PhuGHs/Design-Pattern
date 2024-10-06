package structural_dp.composite.exercise;

public class Client {
    public static void main(String[] args) {
//        xray service
        XRay xray = new XRay();
        xray.getDescription();
        xray.getCost();

//        consultation service
        Consultation consultation = new Consultation();
        consultation.getDescription();
        consultation.getCost();

//        surgery service
        Surgery surgery = new Surgery();
        surgery.getDescription();
        surgery.getCost();

//        composite medical service and add two services
        CompositeMedicalService compositeMedicalService = new CompositeMedicalService();
        compositeMedicalService.addMedicalService(surgery);
        compositeMedicalService.addMedicalService(xray);
        compositeMedicalService.getDescription();
        compositeMedicalService.getCost();

//        add consultation service
        compositeMedicalService.addMedicalService(consultation);
        compositeMedicalService.getDescription();
        compositeMedicalService.getCost();

//        remove surgery service
        compositeMedicalService.removeMedicalService(surgery);
        compositeMedicalService.getDescription();
        compositeMedicalService.getCost();
    }
}
