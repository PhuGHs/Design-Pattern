package structural_dp.bridge.exercise.bridge2.implementations;

import java.util.List;

public abstract class KhoiKienThuc {
    protected List<Subject> subjectList;
    protected int minCredits;

    public KhoiKienThuc(List<Subject> subjectList, int minCredits) {
        this.subjectList = subjectList;
        this.minCredits = minCredits;
    }

    public KhoiKienThuc(int minCredits) {
        this.minCredits = minCredits;
    }

    public abstract void printField();
    public abstract void addSubjects(List<Subject> subjects);
}
