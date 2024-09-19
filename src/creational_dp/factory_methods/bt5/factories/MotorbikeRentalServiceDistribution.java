package creational_dp.factory_methods.bt5.factories;

import creational_dp.factory_methods.bt5.services.MotorbikeRental;
import creational_dp.factory_methods.bt5.services.Service;

public class MotorbikeRentalServiceDistribution extends Store {
    @Override
    public Service createService() {
        return new MotorbikeRental();
    }
}
