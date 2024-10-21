package structural_dp.proxy.excercise;

public class ClothingItem {
    private String productName;
    private double price;
    private ProxyClothingImage proxyClothingImage;

    public ClothingItem(String productName, double price, ProxyClothingImage proxyClothingImage) {
        this.productName = productName;
        this.price = price;
        this.proxyClothingImage = proxyClothingImage;
    }

    public void displayItem() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public void displayImage() {
        proxyClothingImage.displayImage();
    }
}
