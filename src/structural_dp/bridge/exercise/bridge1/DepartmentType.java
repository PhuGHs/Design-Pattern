package structural_dp.bridge.exercise.bridge1;

public enum DepartmentType {
    ACTIVITY("Organisational Activities"),
    SALARY("Salary policies"),
    RECRUITMENT("Recruitment policies");

    private String type;

    DepartmentType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
