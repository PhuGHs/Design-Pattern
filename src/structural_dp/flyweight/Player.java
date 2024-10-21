package structural_dp.flyweight;

public class Player {
    private String name;
    private String number;
    private String position;
    private Team team;

    public Player(String name, String number, String position, Team team) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.team = team;
    }

    public void displayInfo() {
        System.out.println("Player{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", position='" + position + '\'' +
                ", team=" + team +
                '}');
    }
}
