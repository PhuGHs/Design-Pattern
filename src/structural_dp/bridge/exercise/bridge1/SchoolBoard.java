package structural_dp.bridge.exercise.bridge1;

public class SchoolBoard implements IOperator {
    @Override
    public void manageOrganisationalActivities() {
        System.out.println("School Board is managing Organisational Activities");
    }

    @Override
    public void manageSalaryPolicies() {
        System.out.println("School Board is managing Salary Policies");
    }

    @Override
    public void manageRecruitmentPolicies() {
        System.out.println("School Board is managing Recruitment Policies");
    }
}
