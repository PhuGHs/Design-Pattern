package creational_dp.prototype.bt3;

import creational_dp.prototype.example2.Invoice;

public abstract class Programme implements ICloneableProgramme {
    protected String name;
    protected double duration;
    protected EntertainmentType entertainmentType;

    public Programme(String name, double duration, EntertainmentType entertainmentType) {
        this.name = name;
        this.duration = duration;
        this.entertainmentType = entertainmentType;
    }

    public Programme() {
    }

    protected void modifyName(String name) {
        this.name = name;
    }
    protected void modifyDuration(double duration) {
        this.duration = duration;
    }
    protected void modifyEntertainmentType(EntertainmentType entertainmentType) {
        this.entertainmentType = entertainmentType;
    }
    public abstract Programme clone();
    protected void showEntertainment() {
        System.out.println("Entertainment type: " + entertainmentType.getType());
        System.out.println("Name: " + this.name);
        System.out.println("Duration: " + this.duration + " hours");
        System.out.println("----------------------------------------");
    }
}
