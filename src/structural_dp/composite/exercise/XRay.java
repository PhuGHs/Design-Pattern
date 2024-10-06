package structural_dp.composite.exercise;

public class XRay implements IMedicalService {
    @Override
    public void getDescription() {
        System.out.println("XRAY description");
    }

    @Override
    public void getCost() {
        System.out.println("XRAY cost");
    }
}
