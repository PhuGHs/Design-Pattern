package creational_dp.factory_methods.bt5.factories;

import creational_dp.factory_methods.bt5.services.Service;

public abstract class Store {
    private Service service;
    public void init() {
        if (service == null) {
            service = createService();
        }
        service.printServiceCalculatingProcess();
    }

    public abstract Service createService();
}
