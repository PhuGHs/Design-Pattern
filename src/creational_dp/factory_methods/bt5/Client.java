package creational_dp.factory_methods.bt5;

import creational_dp.factory_methods.bt5.factories.LaundryServiceDistribution;
import creational_dp.factory_methods.bt5.factories.MotorbikeRentalServiceDistribution;
import creational_dp.factory_methods.bt5.factories.PhotocopyServiceDistribution;
import creational_dp.factory_methods.bt5.factories.Store;

import java.util.Scanner;

public class Client {
    private static Store store;
    public static void main(String[] args) {
        defineServices();
        printService();
    }

    static void defineServices() {
        System.out.println("Select which service you want to use: \n");
        System.out.println("1. Laundry");
        System.out.println("2. Photocopy");
        System.out.println("3. Motorbike rental");

        System.out.println("Enter your choice here: ");
        Scanner obj = new Scanner(System.in);
        int choice = obj.nextInt();
        switch (choice) {
            case 1:
                store = new LaundryServiceDistribution();
                break;
            case 2:
                store = new PhotocopyServiceDistribution();
                break;
            case 3:
                store = new MotorbikeRentalServiceDistribution();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    static void printService() {
        if (store != null) {
            store.init();
        }
    }
}
