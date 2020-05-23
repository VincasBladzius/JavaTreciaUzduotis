import players.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Match{

    private int HostScore;
    private int VisitorScore;
    private String HostName;
    private String VisitorName;
    private HashSet<Player> AllPlayers = new HashSet<>();

    public <T extends Player> Match() {

        }

    public HashSet<Player> getAllPlayers() {
        return AllPlayers;
    }

    public void setAllPlayers(Player player) {
       AllPlayers.add(player);
    }

    public int getHostScore() {
        return HostScore;
    }

    public <T extends Player> void setHostScore(ArrayList<T> roster) {
        HostScore = setMatchScore(roster);
    }

    public int getVisitorScore() {
        return VisitorScore;
    }

    public <T extends Player> void setVisitorScore(ArrayList<T> roster) {
        VisitorScore = setMatchScore(roster);
    }

    public <T extends Player> int setMatchScore(ArrayList<T> roster) {
        int matchPoints;
        int matchScore = 0;
        ArrayList<Player> scorers = new ArrayList<>();
        for(Player<T> player : roster){
              player.setMatchPoints();
            matchPoints = player.getMatchPoints();
            matchScore += matchPoints;
            player.setTotalPoints(matchPoints);
            scorers.add(player);
            setAllPlayers(player);
        }
        Collections.sort(scorers, new SortScorers());
        Collections.reverse(scorers);
        return matchScore;
    }

    public void setHostName(String hostName) {
        HostName = hostName;
    }


    public void setVisitorName(String visitorName) {
        VisitorName = visitorName;
    }

    public <T extends Player> void playMatch(Team<T> homeTeam, Team<T> visitorTeam){
        setHostScore(homeTeam.getRoster());
        setVisitorScore(visitorTeam.getRoster());
        setHostName(homeTeam.getTeamNationality());
        setVisitorName(visitorTeam.getTeamNationality());
        if(getHostScore() > getVisitorScore()){
            homeTeam.setWon(1);
            visitorTeam.setLost(1);
        }else if (getHostScore() < getVisitorScore()){
            homeTeam.setLost(1);
            visitorTeam.setWon(1);
        }else if (getHostScore() == getVisitorScore()){
            homeTeam.setWon(1);
            visitorTeam.setLost(1);
        }
    }//playMatch

    @Override
    public String toString() {
        return HostName + " " + HostScore + " : " + VisitorScore + " " + VisitorName;
    }
}




