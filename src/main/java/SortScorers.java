import players.Player;

import java.util.Comparator;

public class SortScorers implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getMatchPoints() - o2.getMatchPoints();
    }
}
