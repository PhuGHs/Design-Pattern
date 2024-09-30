package creational_dp.prototype.bt_prototype;

public class Film extends Programme {
    public Film(String name, double duration, EntertainmentType entertainmentType) {
        super(name, duration, entertainmentType);
    }

    public Film() {
        super();
    }

    @Override
    public Programme clone() {
        System.out.println("<<<<<<= Cloning film =>>>>>>");
        Film f = new Film();
        f.name = this.name;
        f.duration = this.duration;
        f.entertainmentType = this.entertainmentType;
        return f;
    }
}
