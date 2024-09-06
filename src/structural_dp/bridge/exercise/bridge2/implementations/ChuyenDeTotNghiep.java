package structural_dp.bridge.exercise.bridge2.implementations;

import java.util.List;

public class ChuyenDeTotNghiep extends KhoiTotNghiep {
    public ChuyenDeTotNghiep(List<Subject> subjectList, int minCredits) {
        super(subjectList, minCredits);
    }

    @Override
    public void printField() {
        super.printField();
        System.out.println("Chon chuyen de tot nghiep: \n");
        for (Subject subject : subjectList) {
            subject.printSubject();
        }
    }
}
