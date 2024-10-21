package structural_dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Team manUtd = PlayerFactory.getTeam("Manchester United", "mufc.png", "Red");

        Player player1 = new Player("Bruno Fernandes", "8", "Midfielder", manUtd);

        Player player2 = new Player("Marcus Rashford", "10", "Forward",manUtd
        );

        Team chelsea = PlayerFactory.getTeam("Chelsea", "cfc.png", "Blue");

        Player player3 = new Player("Kai Havertz", "29", "Forward", chelsea);

        Player player4 = new Player("Harry Maguire", "5", "Defender", PlayerFactory.getTeam("Manchester United", "mufc.png", "Red"));

        player1.displayInfo();
        player2.displayInfo();
        player3.displayInfo();
        player4.displayInfo();
        System.out.println("Number of teams: " + PlayerFactory.getSize());
    }
}
