package creational_dp.factory_methods.bt5.factories;

import creational_dp.factory_methods.bt5.services.Photocopy;
import creational_dp.factory_methods.bt5.services.Service;

public class PhotocopyServiceDistribution extends Store {
    @Override
    public Service createService() {
        return new Photocopy();
    }
}
