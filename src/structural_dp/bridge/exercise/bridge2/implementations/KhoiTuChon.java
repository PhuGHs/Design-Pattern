package structural_dp.bridge.exercise.bridge2.implementations;

import java.util.List;

public class KhoiTuChon extends KhoiKienThuc {
    public KhoiTuChon(int minCredits) {
        super(minCredits);
    }

    public KhoiTuChon(List<Subject> subjectList, int minCredits) {
        super(subjectList, minCredits);
    }

    @Override
    public void printField() {
        System.out.println("Khoi tu chon: \n");
        for (Subject subject : subjectList) {
            subject.printSubject();
        }
    }

    @Override
    public void addSubjects(List<Subject> subjects) {

    }
}
