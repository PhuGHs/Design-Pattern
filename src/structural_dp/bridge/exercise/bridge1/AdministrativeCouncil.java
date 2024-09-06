package structural_dp.bridge.exercise.bridge1;

public class AdministrativeCouncil implements IOperator {
    @Override
    public void manageOrganisationalActivities() {
        System.out.println("Administrative Council is organising activities");
    }

    @Override
    public void manageSalaryPolicies() {
        System.out.println("Administrative Council is managing salary policies");
    }

    @Override
    public void manageRecruitmentPolicies() {
        System.out.println("Administrative Council is managing recruitment policies");
    }
}
