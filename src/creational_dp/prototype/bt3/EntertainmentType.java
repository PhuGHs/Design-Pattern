package creational_dp.prototype.bt3;

public enum EntertainmentType {
    Film("Film"),
    TVProgramme("TVProgramme"),
    MusicEvent("MusicEvent");

    private String type;

    private EntertainmentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
