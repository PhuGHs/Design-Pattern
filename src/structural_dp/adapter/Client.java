package structural_dp.adapter;

public class Client {
    public static void main(String[] args) {
        InPersonCourse inPersonCourse = new InPersonCourse();
        OnlineCourseAdapter onlineCourseAdapter = new OnlineCourseAdapter(new OnlineCourse());
        SelfStudyCourseAdapter selfStudyCourseAdapter = new SelfStudyCourseAdapter(new SelfStudyCourse());

        System.out.println("------------ In Person Course ------------");
        inPersonCourse.start();
        inPersonCourse.attendClass();
        inPersonCourse.getDetails();
        inPersonCourse.getSchedule();

        System.out.println("------------ Online Course ------------");
        onlineCourseAdapter.getDetails();
        onlineCourseAdapter.start();
        onlineCourseAdapter.joinSession();
        onlineCourseAdapter.viewTimetable();

        System.out.println("------------ Self study Course ------------");
        selfStudyCourseAdapter.start();
        selfStudyCourseAdapter.getDetails();
        selfStudyCourseAdapter.accessMaterial();
        selfStudyCourseAdapter.getDeadline();
    }
}
