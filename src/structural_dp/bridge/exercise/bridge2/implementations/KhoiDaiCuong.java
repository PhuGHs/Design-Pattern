package structural_dp.bridge.exercise.bridge2.implementations;


import java.util.ArrayList;
import java.util.List;

//Concrete implementation
public class KhoiDaiCuong extends KhoiKienThuc {
    public KhoiDaiCuong(int minCredits) {
        super(minCredits);
        subjectList = new ArrayList<>();
    }

    public KhoiDaiCuong(List<Subject> subjectList, int minCredits) {
        super(subjectList, minCredits);
    }

    @Override
    public void printField() {
        System.out.println("Khoi dai cuong: \n");
        for (Subject subject : subjectList) {
            subject.printSubject();
        }
    }

    @Override
    public void addSubjects(List<Subject> subjects) {
        this.subjectList.addAll(subjects);
    }

}
