package structural_dp.bridge.exercise.bridge1;

import java.util.List;

public abstract class Organisation {
    protected IOperator operator;
    protected List<Department> departments;
    protected String organisationName;
    protected String phoneNumber;
    protected String address;
    protected String field;

    public Organisation(IOperator operator) {
        this.operator = operator;
    }

    public Organisation(IOperator operator, List<Department> departments, String organisationName, String phoneNumber, String address, String field) {
        this.operator = operator;
        this.departments = departments;
        this.organisationName = organisationName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.field = field;
    }

    public abstract void performOperations();
}
