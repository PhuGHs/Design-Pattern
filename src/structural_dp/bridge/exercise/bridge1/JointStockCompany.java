package structural_dp.bridge.exercise.bridge1;

import java.util.ArrayList;
import java.util.List;

public class JointStockCompany extends Organisation {

    public JointStockCompany(IOperator operator, List<Department> departments, String organisationName, String phoneNumber, String address, String field) {
        super(operator, departments, organisationName, phoneNumber, address, field);
    }

    @Override
    public void performOperations() {

    }
}
