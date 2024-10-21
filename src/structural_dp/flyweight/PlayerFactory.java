package structural_dp.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PlayerFactory {
    static Map<String, Team> teams = new HashMap<>();

    public static Team getTeam(String team, String logo, String color) {
        Team result = teams.get(team);
        if (Objects.isNull(result)) {
            result = new Team(team, logo, color);
            teams.put(team, result);
        }
        return result;
    }

    public static int getSize() {
        return teams.size();
    }
}
