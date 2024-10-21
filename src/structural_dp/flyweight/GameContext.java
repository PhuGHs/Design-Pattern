package structural_dp.flyweight;

import java.util.List;

public class GameContext {
    private Player player;
    private Team team;

    public GameContext(Player player, Team team) {
        this.player = player;
        this.team = PlayerFactory.getTeam(team.getName(), team.getLogo(), team.getColor());
    }

    public Player createPlayer() {
        return team.createPlayer(player.getName(), player.getNumber(), player.getPosition());
    }
}
