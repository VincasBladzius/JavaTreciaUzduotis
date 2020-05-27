import javafx.scene.control.TextArea;
import players.Player;

import java.util.*;

public class Games {

    public ArrayList<String> sortByWins(TournamentTeams teams, SortTeamsByWins sortTeamsByWins){
        ArrayList<String> t = new ArrayList<>();
        Collections.sort(teams.getMatches(), new SortTeamsByWins());
        Collections.reverse(teams.getMatches());
        int i = 0;
        for (Team team : teams.getMatches()) {
            String a = (teams.getMatches().get(i).getTeamNationality());
            t.add(a);
            i++;
        }
        return t;
    }//sortByWins

    public ArrayList<String> sortByAlphabet(ArrayList<Team> teams){
        ArrayList<String> t = new ArrayList<>();
        Collections.sort(teams);
        for (Team team : teams){
            t.add(team.getTeamNationality());
        }
        return t;
    }//sortByAlphabet

    public ArrayList<String> printAllPlayers(HashSet<Player> allPlayersSet){
        ArrayList<Player> allPlayers = new ArrayList<>(allPlayersSet);
        ArrayList<String> allPlayersToPrint = new ArrayList<>();
        Collections.sort(allPlayers);
        for (Player player : allPlayers){
            allPlayersToPrint.add(player.toString());
        }
        return allPlayersToPrint;
    }//printAllPlayers

    public ArrayList<String> printCertainPlayers(HashSet<Player> allPlayersSet, String nation){
        ArrayList<Player> allPlayers = new ArrayList<>(allPlayersSet);
        ArrayList<String> certainPlayersToPrint = new ArrayList<>();
        Collections.sort(allPlayers);
        for (Player player : allPlayers){
           if(nation.equals(player.getNationality())){
               certainPlayersToPrint.add(player.toString());
           }else if(nation.equals("All")){
               certainPlayersToPrint = printAllPlayers(allPlayersSet);
           }
        }
        return certainPlayersToPrint;
    }//printCertainPlayers

    public void printMatches(ArrayList<String> printMatches, String nation, TextArea AllMatches){
        AllMatches.clear();
        printMatches.forEach(matchString -> {
            if(matchString.contains(nation)){
                AllMatches.appendText(matchString);
            }else if(nation.equals("All")){
                AllMatches.appendText(matchString);
            }
        });
        //return certainMatches;
    }
}
