package structural_dp.bridge.exercise.bridge1;

import java.util.List;

public class Department {
    private Organisation organisation;
    private String departmentName;
    private DepartmentType departmentType;
    private List<Employee> employees;

    public Department(Organisation organisation, String departmentName, DepartmentType departmentType) {
        this.organisation = organisation;
        this.departmentName = departmentName;
        this.departmentType = departmentType;
    }
}
