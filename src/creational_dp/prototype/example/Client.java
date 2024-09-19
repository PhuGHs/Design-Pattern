package creational_dp.prototype.example;

public class Client {
    public static void main(String[] args) {
        Stamp originalStamp = new Stamp("Circle", "Red", "Company A");
        originalStamp.showStamp();

        Stamp clonedStamp1 = originalStamp.clone();
        clonedStamp1.setColor("Blue");
        clonedStamp1.setText("Company B");
        clonedStamp1.showStamp();

        Stamp clonedStamp2 = originalStamp.clone();
        clonedStamp2.setColor("Green");
        clonedStamp2.setText("Company C");
        clonedStamp2.showStamp();
    }
}
