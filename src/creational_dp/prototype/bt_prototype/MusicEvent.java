package creational_dp.prototype.bt_prototype;

public class MusicEvent extends Programme {
    public MusicEvent(String name, double duration, EntertainmentType entertainmentType) {
        super(name, duration, entertainmentType);
    }

    public MusicEvent() {
        super();
    }

    @Override
    public Programme clone() {
        System.out.println("<<<<<<= Cloning music event =>>>>>>");
        MusicEvent f = new MusicEvent();
        f.name = this.name;
        f.duration = this.duration;
        f.entertainmentType = this.entertainmentType;
        return f;
    }
}
