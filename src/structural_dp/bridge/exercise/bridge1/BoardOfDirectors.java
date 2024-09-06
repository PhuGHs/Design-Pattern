package structural_dp.bridge.exercise.bridge1;

public class BoardOfDirectors implements IOperator {
    @Override
    public void manageOrganisationalActivities() {
        System.out.println("Board of Directors is managing activities");
    }

    @Override
    public void manageSalaryPolicies() {
        System.out.println("Board of Directors is managing salary policies");
    }

    @Override
    public void manageRecruitmentPolicies() {
        System.out.println("Board of Directors is managing recruitment policies");
    }
}
