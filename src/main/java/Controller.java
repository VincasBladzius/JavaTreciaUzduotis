import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;


public class Controller {
    private Games games;
    private TournamentTeams teams;
    private Match match;
    private ArrayList<String> m = new ArrayList<>();
    @FXML
    private ListView TeamsInAlphabet;
    @FXML
    private ListView PlayersInAlphabet;
    @FXML
    private TextArea AllResults;

    @FXML
    public void initialize(){
        this.games = new Games();
        this.teams = new TournamentTeams();


        showAllTeams();
    }
    public void performTournament(){
        this.teams = new TournamentTeams();
        this.match = new Match();
        m.clear();
        AllResults.clear();
        TeamsInAlphabet.getItems().clear();
        PlayersInAlphabet.getItems().clear();

        for (int i = 0; i < teams.getMatches().size(); i++) {
            for (int j = 0; j < teams.getMatches().size(); j++) {
                if(i != j) {
                    match.playMatch(teams.getMatches().get(i), teams.getMatches().get(j));
                    setM(match.toString() + "\n");
                    AllResults.appendText(match.toString() + "\n");


                }
            }//for j
        }//for j
        TeamsInAlphabet.getItems().setAll(games.sortByWins(teams, new SortTeamsByWins()));
        TeamsInAlphabet.getItems().add("All");
        PlayersInAlphabet.getItems().setAll(games.printAllPlayers(match.getAllPlayers()));
        TeamsInAlphabet.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }//performMatch

    @FXML
    public void handleClickListView(){
       String selectedTeam = (String)TeamsInAlphabet.getSelectionModel().getSelectedItem();
        PlayersInAlphabet.getItems().setAll(games.printCertainPlayers(match.getAllPlayers(), selectedTeam));
        games.printMatches(getM(), selectedTeam, AllResults);
    }

    @FXML
    public void onStartClicked(){
        performTournament();
    }

    public void showAllTeams(){
        TeamsInAlphabet.getItems().setAll(games.sortByAlphabet(teams.getMatches()));
        TeamsInAlphabet.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }

    public ArrayList<String> getM() {
        return m;
    }

    public void setM(String matchString) {
        this.m.add(matchString);
    }
}
