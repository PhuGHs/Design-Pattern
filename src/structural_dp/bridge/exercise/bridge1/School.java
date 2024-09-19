package structural_dp.bridge.exercise.bridge1;

public class School extends Organisation {
    public School(IOperator operator) {
        super(operator);
    }

    @Override
    public void performOperations() {
        operator.manageSalaryPolicies();
        operator.manageRecruitmentPolicies();
        operator.manageOrganisationalActivities();
    }
}
