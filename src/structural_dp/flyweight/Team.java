package structural_dp.flyweight;

public class Team {
    private String name;
    private String logo;
    private String color;

    public Team(String name, String logo, String color) {
        this.name = name;
        this.logo = logo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Team{name='" + name + "', color='" + color + "', logo='" + logo + "'}";
    }
}
