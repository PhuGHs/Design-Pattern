package structural_dp.composite.exercise;

public class Consultation implements IMedicalService {
    @Override
    public void getDescription() {
        System.out.println("Consultation Description");
    }

    @Override
    public void getCost() {
        System.out.println("Consultation Cost");
    }
}
