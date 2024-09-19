package structural_dp.bridge.exercise.bridge2.abstractions;

import structural_dp.bridge.exercise.bridge2.implementations.Subject;

import java.util.List;

public class ChuyenNganh {
    private String goal;
    private List<Subject> subjects;

    public ChuyenNganh(String goal, List<Subject> subjects) {
        this.goal = goal;
        this.subjects = subjects;
    }
}
