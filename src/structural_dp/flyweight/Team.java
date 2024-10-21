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

    public Player createPlayer(String name, String number, String position) {
        Player player = new Player();
        player.setTeam(this);
        player.setName(name);
        player.setNumber(number);
        player.setPosition(position);

        return player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
