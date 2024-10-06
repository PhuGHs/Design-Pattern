package structural_dp.adapter;

public class SelfStudyCourseAdapter implements ICourse {
    private SelfStudyCourse selfStudyCourse;

    public SelfStudyCourseAdapter(SelfStudyCourse selfStudyCourse) {
        this.selfStudyCourse = selfStudyCourse;
    }

    @Override
    public void start() {
        System.out.println("Start self study course");
    }

    @Override
    public void getDetails() {
        System.out.println("get Self study course details");
    }

    public void accessMaterial() {
        selfStudyCourse.accessMaterial();
    }

    public void getDeadline() {
        selfStudyCourse.getDeadline();
    }
}
