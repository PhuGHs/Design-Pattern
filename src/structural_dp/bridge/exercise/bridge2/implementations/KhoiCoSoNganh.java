package structural_dp.bridge.exercise.bridge2.implementations;

import java.util.List;

//Concrete implementation
public class KhoiCoSoNganh extends KhoiKienThuc {
    public KhoiCoSoNganh(List<Subject> subjectList, int minCredits) {
        super(subjectList, minCredits);
    }

    @Override
    public void printField() {
        System.out.println("Khoi co so nganh: \n");
        for (Subject subject : subjectList) {
            subject.printSubject();
        }
    }

    @Override
    public void addSubjects(List<Subject> subjects) {
    }

}
