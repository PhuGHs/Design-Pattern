package creational_dp.factory_methods.bt5.services;

public class Photocopy implements Service {
    private int numberOfPages;
    private double unitPrice;

    public Photocopy(int numberOfPages, double unitPrice) {
        this.numberOfPages = numberOfPages;
        this.unitPrice = unitPrice;
    }

    public Photocopy() {
    }

    @Override
    public void printServiceCalculatingProcess() {
        System.out.println("Photocopy calculating process \n");
        System.out.println("result = number of pages * unit price");
    }

    @Override
    public void enterService() {

    }
}
