package creational_dp.factory_methods.bt5.factories;

import creational_dp.factory_methods.bt5.services.Service;

public abstract class Store {
    public void init() {
        Service service = createService();
        service.printServiceCalculatingProcess();
    }

    public abstract Service createService();
}
