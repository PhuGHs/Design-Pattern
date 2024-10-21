package structural_dp.proxy.excercise;

public class ProxyClothingImage implements ClothingService {
    private ClothingImage clothingImage;

    public ProxyClothingImage(ClothingImage clothingImage) {
        this.clothingImage = clothingImage;
    }

    @Override
    public void displayImage() {
        clothingImage.displayImage();
    }
}
