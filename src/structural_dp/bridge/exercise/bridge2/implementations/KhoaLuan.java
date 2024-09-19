package structural_dp.bridge.exercise.bridge2.implementations;

import java.util.List;

public class KhoaLuan extends KhoiTotNghiep {
    public KhoaLuan(List<Subject> subjectList, int minCredits) {
        super(subjectList, minCredits);
    }

    @Override
    public void printField() {
        super.printField();
        System.out.println("Chon Khoa luan: \n");
        for (Subject subject : subjectList) {
            subject.printSubject();
        }
    }
}
