package creational_dp.prototype.bt_prototype;

public class TVProgramme extends Programme {
    public TVProgramme(String name, double duration, EntertainmentType entertainmentType) {
        super(name, duration, entertainmentType);
    }

    public TVProgramme() {
        super();
    }

    @Override
    public Programme clone() {
        System.out.println("<<<<<<= Cloning tv programme =>>>>>>");
        TVProgramme f = new TVProgramme();
        f.name = this.name;
        f.duration = this.duration;
        f.entertainmentType = this.entertainmentType;
        return f;
    }
}
