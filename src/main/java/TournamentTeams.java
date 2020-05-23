import players.*;

import java.util.ArrayList;

public class TournamentTeams{
    private ArrayList<France> frenchSquad  = new ArrayList<>();
    private ArrayList<Greece> greekSquad = new ArrayList<>();;
    private ArrayList<Lithuania> lithuanianSquad  = new ArrayList<>();
    private ArrayList<Slovenia> slovenianSquad  = new ArrayList<>();
    private ArrayList<Spain> spanishSquad  = new ArrayList<>();
    private ArrayList<Team> matches = new ArrayList<>();

   public TournamentTeams() {
       createAllSquads();
       setMatches();
    }

    public ArrayList<France> getFrenchSquad() {
        return frenchSquad;
    }

    public ArrayList<Greece> getGreekSquad() {
        return greekSquad;
    }

    public ArrayList<Lithuania> getLithuanianSquad() {
        return lithuanianSquad;
    }

    public ArrayList<Slovenia> getSlovenianSquad() {
        return slovenianSquad;
    }

    public ArrayList<Spain> getSpanishSquad() {
        return spanishSquad;
    }

    public void setFrenchSquad() {
       int i = 0;
       while(i < 5){
           frenchSquad.add(new France());
           i++;
       }
    }

    public void setGreekSquad() {
        int i = 0;
        while(i < 5){
            greekSquad.add(new Greece());
            i++;
        }
    }

    public void setLithuanianSquad() {
        int i = 0;
        while(i < 5){
            lithuanianSquad.add(new Lithuania());
            i++;
        }
    }

    public void setSlovenianSquad() {
        int i = 0;
        while(i < 5){
            slovenianSquad.add(new Slovenia());
            i++;
        }
    }

    public void setSpanishSquad() {
        int i = 0;
        while(i < 5){
            spanishSquad.add(new Spain());
            i++;
        }
    }

    public ArrayList<Team> getMatches() {
        return matches;
    }

    public void setMatches() {
        Team<France> france = new Team<>(getFrenchSquad());
        Team<Greece> greece = new Team<>(getGreekSquad());
        Team<Lithuania> lithuania = new Team<>(getLithuanianSquad());
        Team<Slovenia> slovenia = new Team<>(getSlovenianSquad());
        Team<Spain> spain = new Team<>(getSpanishSquad());
        this.matches.add(france);
        this.matches.add(greece);
        this.matches.add(lithuania);
        this.matches.add(slovenia);
        this.matches.add(spain);
    }

    public void createAllSquads(){
        setFrenchSquad();
        setGreekSquad();
        setLithuanianSquad();
        setSlovenianSquad();
        setSpanishSquad();
    }

}
