package structural_dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<Player>();

        Player player = new Player("Le Van Phu", "248", "LW");
        Player secondPlayer = new Player("Player A", "10", "CM");
        Team team = new Team("Manchester United", "mu.png", "Red");
        GameContext gameContext = new GameContext(player, team);
        GameContext secondGameContext = new GameContext(secondPlayer, team);
        gameContext.createPlayer().getPlayer();
        secondGameContext.createPlayer().getPlayer();
    }
}
