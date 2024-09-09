package creational_dp.factory_methods.bt5.services;

public class MotorbikeRental implements Service {
    private double pricePerHour;
    private double numberOfHourRenting;

    public MotorbikeRental(double pricePerHour, double numberOfHourRenting) {
        this.pricePerHour = pricePerHour;
        this.numberOfHourRenting = numberOfHourRenting;
    }

    public MotorbikeRental() {
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getNumberOfHourRenting() {
        return numberOfHourRenting;
    }

    public void setNumberOfHourRenting(double numberOfHourRenting) {
        this.numberOfHourRenting = numberOfHourRenting;
    }

    @Override
    public void printServiceCalculatingProcess() {
        System.out.println("MotorbikeRental Service Calculating Process");
        System.out.println("result = pricePerHour * numberOfHourRenting");
    }

    @Override
    public void enterService() {

    }
}
