package creational_dp.factory_methods.bt5.services;

public class Laundry implements Service {
    private double unitPrice;
    private double kilogram;

    public Laundry(double unitPrice, double kilogram) {
        this.unitPrice = unitPrice;
        this.kilogram = kilogram;
    }

    public Laundry() {
    }

    @Override
    public void printServiceCalculatingProcess() {
        System.out.println("Laundry calculating process \n");
        System.out.println("result = unitPrice * kilogram");
    }

    @Override
    public void enterService() {
        System.out.println("Enter laundry service");
    }
}
