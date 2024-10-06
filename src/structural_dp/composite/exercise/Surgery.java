package structural_dp.composite.exercise;

public class Surgery implements IMedicalService {
    @Override
    public void getDescription() {
        System.out.println("Surgery description");
    }

    @Override
    public void getCost() {
        System.out.println("Surgery cost");
    }
}
