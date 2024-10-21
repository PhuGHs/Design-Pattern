package structural_dp.proxy.excercise;

public class ClothingImage implements ClothingService {
    private String fileName;
    private double imageSize;

    public ClothingImage(String fileName, double imageSize) {
        this.fileName = fileName;
        this.imageSize = imageSize;
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying image " + fileName + " with image size " + imageSize);
    }
}
