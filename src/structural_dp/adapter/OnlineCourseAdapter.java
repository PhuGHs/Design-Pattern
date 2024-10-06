package structural_dp.adapter;

public class OnlineCourseAdapter implements ICourse {
    private OnlineCourse onlineCourse;
    public OnlineCourseAdapter(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void start() {
        System.out.println("Start Online Course");
    }

    @Override
    public void getDetails() {
        System.out.println("get Online Course Details");
    }

    public void joinSession() {
        onlineCourse.joinSession();
    }

    public void viewTimetable() {
        onlineCourse.viewTimetable();
    }
}
