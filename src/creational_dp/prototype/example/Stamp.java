package creational_dp.prototype.example;

public class Stamp implements IStamp {
    private String shape;
    private String color;
    private String text;

    public Stamp(String shape, String color, String text) {
        this.shape = shape;
        this.color = color;
        this.text = text;
    }

    @Override
    public Stamp clone() {
        try {
            return (Stamp) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void showStamp() {
        System.out.println("Shape: " + shape + ", Color: " + color + ", Text: " + text);
    }
}
