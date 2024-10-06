package structural_dp.composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class CompositeMedicalService implements IMedicalService {
    private List<IMedicalService> medicalServices;

    public CompositeMedicalService() {
        medicalServices = new ArrayList<IMedicalService>();
    }

    public void addMedicalService(IMedicalService service) {
        medicalServices.add(service);
    }

    public void removeMedicalService(IMedicalService service) {
        medicalServices.remove(service);
    }

    @Override
    public void getDescription() {
        System.out.println("Medical service group description");
        for (IMedicalService service : medicalServices) {
            service.getDescription();
        }
    }

    @Override
    public void getCost() {
        System.out.println("Medical service group cost");
        for (IMedicalService service : medicalServices) {
            service.getCost();
        }
    }
}
