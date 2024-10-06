package structural_dp.adapter;

public class InPersonCourse implements ICourse {
    @Override
    public void start() {
        System.out.println("Start In Person course");
    }

    @Override
    public void getDetails() {
        System.out.println("In Person course details");
    }

    public void attendClass() {
        System.out.println("Attend In Person course Class");
    }

    public void getSchedule() {
        System.out.println("In Person course Schedule");
    }
}
