package structural_dp.flyweight;

public class Player {
    private String name;
    private String number;
    private String position;
    private Team team;

    public Player(String name, String number, String position) {
        this.name = name;
        this.number = number;
        this.position = position;
    }

    public Player() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public Team getTeam() {
        return team;
    }

    public void getPlayer() {
        System.out.println("Player name: " + this.name);
        System.out.println("Player position: " + this.position);
        System.out.println("Player number: " + this.number);
    }
}
