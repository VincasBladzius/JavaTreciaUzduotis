import java.util.Comparator;

public class SortTeamsByWins implements Comparator <Team>{

    @Override
    public int compare(Team o1, Team o2) {
        return o1.getWon() - o2.getWon();
    }
}
