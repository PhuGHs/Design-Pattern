package structural_dp.bridge.exercise.bridge2.implementations;

import java.util.List;

public class KhoiTotNghiep extends KhoiKienThuc {
    public KhoiTotNghiep(List<Subject> subjectList, int minCredits) {
        super(subjectList, minCredits);
    }

    @Override
    public void printField() {
        System.out.println("Khoi tot nghiep: \n");
    }

    @Override
    public void addSubjects(List<Subject> subjects) {

    }
}
