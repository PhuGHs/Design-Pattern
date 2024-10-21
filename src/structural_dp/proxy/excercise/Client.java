package structural_dp.proxy.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        List<ClothingItem> list = new ArrayList<ClothingItem>();
        ClothingItem item1 = new ClothingItem("Summer dress", 99.99, new ProxyClothingImage(new ClothingImage("summer-address.png", 2.4)));
        ClothingItem item2 = new ClothingItem("Winter coat", 100.0, new ProxyClothingImage(new ClothingImage("winter-coat.png", 5)));

        list.add(item1);
        list.add(item2);
        for (ClothingItem item : list) {
            item.displayItem();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to see product images");
            System.out.println("1. Yes");
            System.out.println("2. No");

            if (scanner.nextInt() == 1) {
                item.displayImage();
            }
        }
    }
}
